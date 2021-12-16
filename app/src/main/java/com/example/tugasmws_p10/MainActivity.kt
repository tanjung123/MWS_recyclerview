package com.example.tugasmws_p10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvSosmed : RecyclerView
    lateinit var  myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        rvSosmed.layoutManager = LinearLayoutManager(this)
        rvSosmed.adapter = myAdapter
    }

    fun init(){
        rvSosmed = findViewById(R.id.rvSosmed)

        var data = ArrayList<SosialMedia>()
        data.add(SosialMedia(R.drawable.yuni_poster,"Yuni","Tgl Tayang : 9 Desember 2021", "Durasi : 2 Jam 2 Menit", "Produksi : Starvision Plus, Fourcolours Films", "Sutradara : Kamila Andini", "Pemain : Arwanda Kirana, Kevin Ardilova, Dimas Aditya, dkk", "Genre : Drama"))
        data.add(SosialMedia(R.drawable.balada_sepasang_kekasih_gila,"Balada Sepasang Kekasih Gila", "Tgl Tayang : 20 Agustus 2021", "Durasi : 1 Jam 30 Menit", "Produksi : KlikFilm Production", "Sutradara : Anggy Umbara", "Pemain : Denny Sumargo, Sara Fajira, Wing Sayz, dkk", "Genre : Drama"))
        data.add(SosialMedia(R.drawable.a_perfect_fit__2021_film_,"A Perfect Fit","Tgl Tayang : 15 Juli 2021", "Durasi : 1 Jam 52 Menit", "Produksi : Starvision Plus; Netflix Indonesia", "Sutradara : Hadrah Daeng Ratu", "Pemain : Nadya Arina, Refal Hady, Laura Theux, dkk", "Genre : Drama, Komedi, Romantis"))
        data.add(SosialMedia(R.drawable.poster_film_ali___ratu_ratu_queens,"Ali & Ratu Ratu Queens","Tgl Tayang : 17 Juni 2021", "Durasi : 1 Jam 40 Menit", "Produksi : Palari Films", "Sutradara : Lucky Kuswandi", "Pemain : Iqbaal Ramadhan, Asri Welas,Nirina Zubir,dkk", "Genre : Drama, Komedi"))
        data.add(SosialMedia(R.drawable.poster_film_june___kopi,"June & Kopi","Tgl Tayang : 28 Januari 2021", "Durasi : 1 jam 30 menit", "Produksi : Aurora Films", "Sutradara : Noviandra Santosa", "Pemain : Acha Septriasa, Ryan Delon, Makayla Rose Hilli, dkk", "Genre : Komedi, Drama, Keluarga"))
        data.add(SosialMedia(R.drawable.sobat_ambyar,"Sobat Ambyar","Tgl Tayang : 14 Januari 2021", "Durasi : 1 jam 41 menit", "Produksi : Magma Entertainment, Paragon Pictures, Rapi Films, Ideosource Entertainment", "Sutradara : Charles Gozali", "Pemain : Bhisma Mulia, Denira Wiraguna, Fransisca Saraswati Puspa Dewi, dkk", "Genre : Komedi, Drama, Romansa"))
        data.add(SosialMedia(R.drawable.affliction,"Affliction","Tgl Tayang : 21 Januari 2021", "Durasi : 1 jam 30 menit", "Produksi : Karuna Pictures, Roemah Rumah Films", "Sutradara : Teddy Soeriaatmadja", "Pemain : Raihaanun, Tutie Kirana, Ibnu Jamil, dkk", "Genre : Horror, Thriller"))
        data.add(SosialMedia(R.drawable.layla_majnun,"Layla Majnun","Tgl Tayang : 11 Februari 2021", "Durasi : 1 jam 59 menit", "Produksi : Starvision Plus", "Sutradara : Monty Tiwa", "Pemain : Acha Septriasa, Reza Rahadian, Baim Wong, dkk", "Genre : Drama, Romansa"))
        data.add(SosialMedia(R.drawable.guru_guru_gokil,"Guru-Guru Gokil","Tgl Tayang : 17 Agustus 2020", "Durasi : 1 jam 41 menit", "Produksi : BASE Entertainment", "Sutradara : Sammaria Simanjuntak", "Pemain : Gading Marten, Boris Bokir, Kevin Ardilova, dkk", "Genre : Drama"))
//        data.add(SosialMedia(R.drawable.youtube,"Youtube","Ini adalah Youtube"))

        myAdapter = MyAdapter(data)
    }
}