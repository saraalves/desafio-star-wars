package com.saraalves.thestarwars.presenter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.saraalves.thestarwars.R
import com.saraalves.thestarwars.presenter.starships.fragment.StarshipFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fm: FragmentManager = supportFragmentManager

        val ft: FragmentTransaction = fm.beginTransaction()
        ft.add(R.id.fragmentContent, StarshipFragment())
        ft.commit()
    }
}