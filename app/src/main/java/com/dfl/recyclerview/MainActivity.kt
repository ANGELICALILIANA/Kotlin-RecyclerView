package com.dfl.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.content.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content)
        ipatRecyclerView.adapter = Adapter(baseContext, mutableListOf(
            ListItem(hour = "10:00", date = "10/10/2021"),
            ListItem(hour = "11:00", date = "11/11/2021"),
            ListItem(hour = "12:00", date = "12/12/2021")
        ))
        ipatRecyclerView.layoutManager = LinearLayoutManager(baseContext)
    }
}