package com.miloud.englishstories

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Adapter
        val StoryAdapter = ArrayAdapter<story>(this,android.R.layout.simple_list_item_1, Data.stories)
        //Bind Adapter to the Listview
        StoriesList.adapter = StoryAdapter
        //Responding to List Click events
        StoriesList.setOnItemClickListener {
            parent, view, position, id ->
            //Toast.makeText(this,"You Clicked on ${Stories[position]}",Toast.LENGTH_LONG).show()
            val intent = Intent(this,FullTextHistoricalActivity::class.java)
            intent.putExtra("ITEM_INDEX",position)
            startActivity(intent)
        }

    }
}
