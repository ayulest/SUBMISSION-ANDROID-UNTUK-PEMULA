package com.ayulest.submission.adapter

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.ayulest.submission.DetailActivity
import com.ayulest.submission.R
import com.ayulest.submission.model.ItemTrainee
import com.bumptech.glide.Glide

class TraineeAdapter (private val listTrainee: ArrayList<ItemTrainee>) : RecyclerView.Adapter<TraineeAdapter.RankViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RankViewHolder{
        val itemRow = LayoutInflater.from(p0.context).inflate(R.layout.item_row_trainee, p0, false)
        return RankViewHolder(itemRow)
    }

    override fun getItemCount(): Int {
        return listTrainee.size
    }

    override fun onBindViewHolder(p0: RankViewHolder, p1: Int) {
        Glide.with(p0.itemView.context)
            .load(listTrainee[p1].photo)
            .into(p0.imgTrainee)
        p0.tvNamaTrainee.text = listTrainee[p1].name
        p0.tvNamaAgency.text = listTrainee[p1].agency
        p0.divContainer.setOnClickListener {

            val intent: Intent = Intent(p0.itemView.context, DetailActivity::class.java)
            intent.putExtra("TITLE ",listTrainee[p1].title )
            intent.putExtra("RANKING ",listTrainee[p1].ranking )
            intent.putExtra("NAME",listTrainee[p1].name)
            intent.putExtra("AGENCY",listTrainee[p1].agency)
            intent.putExtra("AGE",listTrainee[p1].age)
            intent.putExtra("BLOODTYPE ",listTrainee[p1].bloodtype )
            intent.putExtra("HEIGHT ",listTrainee[p1].height )
            intent.putExtra("WEIGHT",listTrainee[p1].weight)
            intent.putExtra("DURATIONOFTRAINEE",listTrainee[p1].durationoftrainee)
            intent.putExtra("HOBBY",listTrainee[p1].hobby)
            intent.putExtra("SPECIALITY",listTrainee[p1].speciality)
            intent.putExtra("WORD",listTrainee[p1].word)
            intent.putExtra("PHOTO",listTrainee[p1].photo)
            p0.itemView.context.startActivity(intent)
        }


    }
    inner class RankViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgTrainee: ImageView = itemView.findViewById(R.id.img_trainee)
        var tvNamaTrainee: TextView = itemView.findViewById(R.id.tv_name_trainee)
        var tvNamaAgency: TextView = itemView.findViewById(R.id.tv_name_agency)

        var divContainer: LinearLayout= itemView.findViewById(R.id.divContainer)
    }

}


