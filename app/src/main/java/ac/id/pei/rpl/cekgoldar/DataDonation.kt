package ac.id.pei.rpl.cekgoldar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*

class DataDonation : AppCompatActivity() {
    lateinit var fire: DatabaseReference
    lateinit var firebaseAuth: FirebaseAuth
    private lateinit var layoutku: RecyclerView
    lateinit var back: View
    private var ambilDatabase: ArrayList<FirebaseDataO> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_donation)
        layoutku = findViewById(R.id.rv_datadonasi)
        back = findViewById(R.id.btn_main_signout)
        fire = FirebaseDatabase.getInstance().getReference("Donation")
        firebaseAuth = FirebaseAuth.getInstance()
        back.setOnClickListener {
            val pindah = Intent(this, MainActivity::class.java)
            startActivity(pindah)
        }
    }
    override fun onStart(){
        super.onStart()
        loadMeFirst()
    }

    private fun loadMeNow(){
        layoutku.layoutManager = LinearLayoutManager(this)
        val myA = FirebaseAdapterDonasi(ambilDatabase)
        layoutku.adapter = myA
    }

    private fun loadMeFirst(){
        fire.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot!!.exists()){
                    ambilDatabase.clear()
                    for (x in snapshot.children){
                        val mymy = x.getValue(FirebaseDataO::class.java)
                        mymy!!.uid = x.key.toString()
                        ambilDatabase.add(mymy!!)
                    }
                }
                loadMeNow()
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })
    }
}