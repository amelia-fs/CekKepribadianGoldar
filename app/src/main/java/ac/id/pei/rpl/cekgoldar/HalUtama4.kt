package ac.id.pei.rpl.cekgoldar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HalUtama4 : AppCompatActivity() {
    lateinit var imageo: ImageView
    lateinit var imagea: ImageView
    lateinit var imageb: ImageView
    lateinit var imageab: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_utama4)
        imageo = findViewById(R.id.daraho4)
        imagea = findViewById(R.id.daraha4)
        imageb = findViewById(R.id.darahb4)
        imageab = findViewById(R.id.darahab4)
        imageo.setOnClickListener {
            val pindah = Intent(this, DataFoodO::class.java)
            startActivity(pindah)
        }
        imagea.setOnClickListener {
            val pindah = Intent(this, DataFoodA::class.java)
            startActivity(pindah)
        }
        imageb.setOnClickListener {
            val pindah = Intent(this, DataFoodB::class.java)
            startActivity(pindah)
        }
        imageab.setOnClickListener {
            val pindah = Intent(this, DataFoodAB::class.java)
            startActivity(pindah)
        }
    }
}