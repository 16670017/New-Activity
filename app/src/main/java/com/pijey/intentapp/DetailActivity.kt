package com.pijey.intentapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object{
        val NAMA: String? = "nama"
        val ASAL: String? = "asal"
        val EMAIL: String? = "email"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //TITLE
        supportActionBar?.title = ("Input Data")
        //SUBTITLE
        supportActionBar?.subtitle = ("Learn Kotlin")

        btnSubmit.setOnClickListener {
            if (edtNama.text.isEmpty() || edtAsal.text.isEmpty() ){
                toast("Kolom Tidak Boleh Kosong", Toast.LENGTH_LONG)
            }else if(edtNama.text.isNotEmpty() || edtAsal.text.isNotEmpty() ){
                toast("Sukses", Toast.LENGTH_LONG)
                val intent = Intent(this, SaveActivity::class.java)
                val bundle = Bundle()

                bundle.putString(NAMA, edtNama.text.toString())
                bundle.putString(ASAL, edtAsal.text.toString())


                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
    private fun toast(message: String, length: Int = Toast.LENGTH_LONG) {
        Toast.makeText(this, message,length).show()
    }
}
