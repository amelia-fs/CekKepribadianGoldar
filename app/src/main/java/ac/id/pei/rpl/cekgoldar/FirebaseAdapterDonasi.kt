package ac.id.pei.rpl.cekgoldar

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class FirebaseAdapterDonasi (private val listDataku: ArrayList<FirebaseDataO>):RecyclerView.Adapter<FirebaseAdapterDonasi.FirebaseViewHolder>() {
    inner class FirebaseViewHolder(myView: View):RecyclerView.ViewHolder(myView){
        var tvNama: TextView = myView.findViewById(R.id.tv_name)
        var tvJk: TextView = myView.findViewById(R.id.tv_jk)
        var tvAlamat: TextView = myView.findViewById(R.id.tv_alamat)
        var tvGoldar: TextView = myView.findViewById(R.id.tv_goldar)
        var btnDel: ImageButton = myView.findViewById(R.id.btn_data_del)
        lateinit var ref: DatabaseReference
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirebaseViewHolder {
        val viewku: View = LayoutInflater.from(parent.context).inflate(R.layout.data_donasi, parent, false)
        return FirebaseViewHolder(viewku)
    }
    override fun onBindViewHolder(holder: FirebaseViewHolder, position: Int) {
        val dataku = listDataku[position]
        holder.ref = FirebaseDatabase.getInstance().getReference("Donation").child(dataku.uid)
        holder.tvNama.text = dataku.Nama
        holder.tvJk.text = dataku.Jenis
        holder.tvAlamat.text = dataku.Alamat
        holder.tvGoldar.text = dataku.Golongan
        holder.btnDel.setOnClickListener {
            holder.ref.removeValue()
        }
    }
    override fun getItemCount(): Int {
        return listDataku.size
    }
}