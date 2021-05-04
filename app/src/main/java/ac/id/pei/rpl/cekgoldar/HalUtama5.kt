package ac.id.pei.rpl.cekgoldar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HalUtama5 : AppCompatActivity() {
    lateinit var imageo: ImageView
    lateinit var imagea: ImageView
    lateinit var imageb: ImageView
    lateinit var imageab: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_utama5)
        imageo = findViewById(R.id.daraho5)
        imagea = findViewById(R.id.daraha5)
        imageb = findViewById(R.id.darahb5)
        imageab = findViewById(R.id.darahab5)
        imageo.setOnClickListener {
            val pindah = Intent(this, DataDiseaseO::class.java)
            startActivity(pindah)
        }
        imagea.setOnClickListener {
            val pindah = Intent(this, DataDiseaseA::class.java)
            startActivity(pindah)
        }
        imageb.setOnClickListener {
            val pindah = Intent(this, DataDiseaseB::class.java)
            startActivity(pindah)
        }
        imageab.setOnClickListener {
            val pindah = Intent(this, DataDiseaseAB::class.java)
            startActivity(pindah)
        }
    }
}