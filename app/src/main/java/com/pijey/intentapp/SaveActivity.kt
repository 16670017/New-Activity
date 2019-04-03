package com.pijey.intentapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_save.*

class SaveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save)

        //TITLE
        supportActionBar?.title = ("New Activity")
        //SUBTITLE
        supportActionBar?.subtitle = ("Intent Implisit and Ekplisit")

        val bundle = intent.extras

        textView.text = (bundle.getCharSequence(DetailActivity.NAMA))
        textView2.text = (bundle.getCharSequence(DetailActivity.ASAL))
        textView3.text = (bundle.getCharSequence(DetailActivity.EMAIL))
    }
}
