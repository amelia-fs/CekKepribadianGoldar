package ac.id.pei.rpl.cekgoldar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HalUtama3 : AppCompatActivity() {
    lateinit var imageo: ImageView
    lateinit var imagea: ImageView
    lateinit var imageb: ImageView
    lateinit var imageab: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_utama3)
        imageo = findViewById(R.id.daraho3)
        imagea = findViewById(R.id.daraha3)
        imageb = findViewById(R.id.darahb3)
        imageab = findViewById(R.id.darahab3)
        imageo.setOnClickListener {
            val pindah = Intent(this, DataRomanceO::class.java)
            startActivity(pindah)
        }
        imagea.setOnClickListener {
            val pindah = Intent(this, DataRomanceA::class.java)
            startActivity(pindah)
        }
        imageb.setOnClickListener {
            val pindah = Intent(this, DataRomanceB::class.java)
            startActivity(pindah)
        }
        imageab.setOnClickListener {
            val pindah = Intent(this, DataRomanceAB::class.java)
            startActivity(pindah)
        }
    }
}