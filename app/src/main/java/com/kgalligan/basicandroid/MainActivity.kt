package com.kgalligan.basicandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val service = BreweryService()
        service.get().subscribe(
                {
                    findViewById<TextView>(R.id.uuid_out).text = it.toString()
                },
                {
                    findViewById<TextView>(R.id.uuid_out).text = it.localizedMessage
                })


    }
}
