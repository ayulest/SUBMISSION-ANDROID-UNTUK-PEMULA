package com.ayulest.submission

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val title = intent.getStringExtra("TITLE ")
        val ranking = intent.getStringExtra("RANKING ")
        val name= intent.getStringExtra("NAME")
        val agency= intent.getStringExtra("AGENCY")
        val age= intent.getStringExtra("AGE")
        val bloodtype = intent.getStringExtra("BLOODTYPE ")
        val height = intent.getStringExtra("HEIGHT ")
        val weight= intent.getStringExtra("WEIGHT")
        val durationoftrainee= intent.getStringExtra("DURATIONOFTRAINEE")
        val hobby= intent.getStringExtra("HOBBY")
        val speciality= intent.getStringExtra("SPECIALITY")
        val word= intent.getStringExtra("WORD")
        val photo= intent.getStringExtra("PHOTO")

       Glide.with(this).load(photo).into(iv_trainee)

        tv_title .text = title
        tv_rank .text= ranking
        tv_name.text = name
        tv_agency.text= agency
        tv_age.text = age
        tv_bloodtype.text= bloodtype
        tv_height.text = height
        tv_weight.text= weight
        tv_durationoftrainee.text = durationoftrainee
        tv_hobby.text= hobby
        tv_speciality.text = speciality
        tv_word.text= word
        tv_names.text= name


    }
}
