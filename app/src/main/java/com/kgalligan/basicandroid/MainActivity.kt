package com.kgalligan.basicandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.kgalligan.basicandroid.shared.UUIDMaker

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.uuid_out).setText(UUIDMaker.makeUUID())
    }
}
