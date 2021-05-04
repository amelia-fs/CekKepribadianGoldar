package ac.id.pei.rpl.cekgoldar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var image: ImageView
    lateinit var image1: ImageView
    lateinit var image2: ImageView
    lateinit var image3: ImageView
    lateinit var image4: ImageView
    lateinit var image5: ImageView
    lateinit var btnAdd: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        image = findViewById(R.id.besttraits)
        image1 = findViewById(R.id.badtraits)
        image2 = findViewById(R.id.carirer)
        image3 = findViewById(R.id.romance)
        image4 = findViewById(R.id.food)
        image5 = findViewById(R.id.disease)
        btnAdd = findViewById(R.id.btn_main_add)
        btnAdd.setOnClickListener{
            startActivity(Intent(this, ActivityAdd::class.java))
        }
        image.setOnClickListener {
            val pindah = Intent(this, HalUtama::class.java)
            startActivity(pindah)
        }
        image1.setOnClickListener {
            val pindah = Intent(this, HalUtama1::class.java)
            startActivity(pindah)
        }
        image2.setOnClickListener {
            val pindah = Intent(this, HalUtama2::class.java)
            startActivity(pindah)
        }
        image3.setOnClickListener {
            val pindah = Intent(this, HalUtama3::class.java)
            startActivity(pindah)
        }
        image4.setOnClickListener {
            val pindah = Intent(this, HalUtama4::class.java)
            startActivity(pindah)
        }
        image5.setOnClickListener {
            val pindah = Intent(this, HalUtama5::class.java)
            startActivity(pindah)
        }
    }
}