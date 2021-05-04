package ac.id.pei.rpl.cekgoldar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class ActivityAdd : AppCompatActivity() {
    lateinit var btnSubmit: Button
    lateinit var btnCancel: Button
    lateinit var etName: EditText
    lateinit var etJk: EditText
    lateinit var etAlamat: EditText
    lateinit var etGoldar: EditText
    lateinit var ref: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        declaration()
        myfunction()
    }
    fun declaration(){
        btnSubmit = findViewById(R.id.btn_add_submit)
        btnCancel = findViewById(R.id.btn_add_cancel)
        etName = findViewById(R.id.et_add_name)
        etJk = findViewById(R.id.et_add_jk)
        etAlamat = findViewById(R.id.et_add_alamat)
        etGoldar = findViewById(R.id.et_add_goldar)
        ref = FirebaseDatabase.getInstance().getReference("Donation")
    }
    fun myfunction(){
        val pindah = Intent(this, DataDonation::class.java)
        val arrayKu = FirebaseDataO()
        btnSubmit.setOnClickListener {
            arrayKu.Nama = etName.text.toString()
            arrayKu.Jenis = etJk.text.toString()
            arrayKu.Alamat = etAlamat.text.toString()
            arrayKu.Golongan = etGoldar.text.toString()
            val taskPush = ref.push()
            taskPush.setValue(arrayKu)
            startActivity(pindah)
        }
        btnCancel.setOnClickListener {
            val pindah = Intent(this, MainActivity::class.java)
            startActivity(pindah)
        }
    }
}