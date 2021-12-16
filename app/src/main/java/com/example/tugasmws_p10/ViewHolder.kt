package com.example.tugasmws_p10

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ViewHolder (inflater: LayoutInflater, parent : ViewGroup )
    : RecyclerView.ViewHolder(inflater.inflate(R.layout.rvitems_template,parent,false)){

    //inisialisasi komponen
    lateinit var ivSosmed : ImageView
    lateinit var tvTitle : TextView
    lateinit var tvDesc : TextView
    lateinit var tvDesc1 : TextView
    lateinit var tvDesc2 : TextView
    lateinit var tvDesc3 : TextView
    lateinit var tvDesc4 : TextView
    lateinit var tvDesc5 : TextView

    init {
        ivSosmed = itemView.findViewById(R.id.ivSosmed)
        tvTitle = itemView.findViewById(R.id.tvTitileSosmed)
        tvDesc = itemView.findViewById(R.id.tvDescSosmed)
        tvDesc1 = itemView.findViewById(R.id.tvDescSosmed1)
        tvDesc2 = itemView.findViewById(R.id.tvDescSosmed2)
        tvDesc3 = itemView.findViewById(R.id.tvDescSosmed3)
        tvDesc4 = itemView.findViewById(R.id.tvDescSosmed4)
        tvDesc5 = itemView.findViewById(R.id.tvDescSosmed5)
    }

    fun bind(data : SosialMedia){
        ivSosmed.setImageResource(data.ivSosmed)
        tvTitle.text = data.tvTitle
        tvDesc.text = data.tvDesc
        tvDesc1.text = data.tvDesc1
        tvDesc2.text = data.tvDesc2
        tvDesc3.text = data.tvDesc3
        tvDesc4.text = data.tvDesc4
        tvDesc5.text = data.tvDesc5
    }

}