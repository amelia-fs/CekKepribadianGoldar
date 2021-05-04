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
class FirebaseAdapterFood (private val listDataku: ArrayList<FirebaseDataO>):RecyclerView.Adapter<FirebaseAdapterFood.FirebaseViewHolder>() {
    inner class FirebaseViewHolder(myView: View):RecyclerView.ViewHolder(myView){
        var tvFood: TextView = myView.findViewById(R.id.tv_food)
        lateinit var ref: DatabaseReference
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirebaseViewHolder {
        val viewku: View = LayoutInflater.from(parent.context).inflate(R.layout.data_food, parent, false)
        return FirebaseViewHolder(viewku)
    }
    override fun onBindViewHolder(holder: FirebaseViewHolder, position: Int) {
        val dataku = listDataku[position]
        holder.tvFood.text = dataku.Food
    }
    override fun getItemCount(): Int {
        return listDataku.size
    }
}