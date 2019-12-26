package com.miloud.englishstories

import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_full_text_historical.*
import kotlinx.android.synthetic.main.content_full_text_historical.*

class FullTextHistoricalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_text_historical)
        setSupportActionBar(toolbar)
        //Read Extra Values
        val itemIndex = intent.extras.get("ITEM_INDEX").toString().toInt()
        //Show the item index value
        Toast.makeText(this,"Item index is:${itemIndex}",Toast.LENGTH_LONG).show()

        title = Data.stories[itemIndex].title
        textViewFullText.setText(Data.stories[itemIndex].fullText)
    }
}
