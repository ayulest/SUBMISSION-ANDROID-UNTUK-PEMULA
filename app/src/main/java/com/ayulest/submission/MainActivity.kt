package com.ayulest.submission

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.ayulest.submission.adapter.TraineeAdapter
import com.ayulest.submission.model.ItemTrainee
import com.ayulest.submission.model.TraineeData


class MainActivity : AppCompatActivity() {
    private lateinit var rvRank: RecyclerView
    private var list: ArrayList<ItemTrainee> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvRank = findViewById(R.id.rv_rank)
        rvRank.setHasFixedSize(true)

        list.addAll(TraineeData.getlistData)
        showRecyclerListTrainee()
    }

    private fun showRecyclerListTrainee() {
        rvRank.layoutManager = LinearLayoutManager(this)
        val listTraineeAdapter = TraineeAdapter(list)
        rvRank.adapter = listTraineeAdapter

    }


}



