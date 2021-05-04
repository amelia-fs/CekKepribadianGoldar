package ac.id.pei.rpl.cekgoldar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HalUtama2 : AppCompatActivity() {
    lateinit var imageo: ImageView
    lateinit var imagea: ImageView
    lateinit var imageb: ImageView
    lateinit var imageab: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_utama2)
        imageo = findViewById(R.id.daraho2)
        imagea = findViewById(R.id.daraha2)
        imageb = findViewById(R.id.darahb2)
        imageab = findViewById(R.id.darahab2)
        imageo.setOnClickListener {
            val pindah = Intent(this, DataKarirO::class.java)
            startActivity(pindah)
        }
        imagea.setOnClickListener {
            val pindah = Intent(this, DataKarirA::class.java)
            startActivity(pindah)
        }
        imageb.setOnClickListener {
            val pindah = Intent(this, DataKarirB::class.java)
            startActivity(pindah)
        }
        imageab.setOnClickListener {
            val pindah = Intent(this, DataKarirAB::class.java)
            startActivity(pindah)
        }
    }
}