package ac.id.pei.rpl.cekgoldar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HalUtama : AppCompatActivity() {
    lateinit var imageo: ImageView
    lateinit var imagea: ImageView
    lateinit var imageb: ImageView
    lateinit var imageab:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_utama)
        imageo = findViewById(R.id.daraho)
        imagea = findViewById(R.id.daraha)
        imageb = findViewById(R.id.darahb)
        imageab = findViewById(R.id.darahab)
        imageo.setOnClickListener {
            val pindah = Intent(this, DataBestO::class.java)
            startActivity(pindah)
        }
        imagea.setOnClickListener {
            val pindah = Intent(this, DataBestA::class.java)
            startActivity(pindah)
        }
        imageb.setOnClickListener {
            val pindah = Intent(this, DataBestB::class.java)
            startActivity(pindah)
        }
        imageab.setOnClickListener {
            val pindah = Intent(this, DataBestAB::class.java)
            startActivity(pindah)
        }
    }
}