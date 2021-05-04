package ac.id.pei.rpl.cekgoldar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HalUtama1 : AppCompatActivity() {
    lateinit var imageo: ImageView
    lateinit var imagea: ImageView
    lateinit var imageb: ImageView
    lateinit var imageab: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_utama1)
        imageo = findViewById(R.id.daraho1)
        imagea = findViewById(R.id.daraha1)
        imageb = findViewById(R.id.darahb1)
        imageab = findViewById(R.id.darahab1)
        imageo.setOnClickListener {
            val pindah = Intent(this, DataWorstO::class.java)
            startActivity(pindah)
        }
        imagea.setOnClickListener {
            val pindah = Intent(this, DataWorstA::class.java)
            startActivity(pindah)
        }
        imageb.setOnClickListener {
            val pindah = Intent(this, DataWorstB::class.java)
            startActivity(pindah)
        }
        imageab.setOnClickListener {
            val pindah = Intent(this, DataWorstAB::class.java)
            startActivity(pindah)
        }
    }
}