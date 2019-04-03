package com.pijey.intentapp

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_detail_activity.setOnClickListener{
            val intent = Intent(this,DetailActivity::class.java)
            startActivity(intent)
        }
        btn_move_activity_data.setOnClickListener{
            val intent = Intent(this, MoveActivity::class.java)
            startActivity(intent)
        }
        btnShare.setOnClickListener {
                val massage: String = btnU.text.toString()
                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT, massage)
                intent.type = "text/plain"

                startActivity(Intent.createChooser(intent, "Share to :"))
            }
        }
    }

