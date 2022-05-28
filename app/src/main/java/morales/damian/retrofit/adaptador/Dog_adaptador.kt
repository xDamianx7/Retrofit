package morales.damian.retrofit.adaptador

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import morales.damian.retrofit.Dog_VH
import morales.damian.retrofit.R

class Dog_adaptador (private val images:List<String>): RecyclerView.Adapter<Dog_VH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Dog_VH {
        val layoutInflater = LayoutInflater.from(parent.context)
        return Dog_VH (layoutInflater.inflate(R.layout.item_dog, parent, false))
    }

    override fun onBindViewHolder(holder: Dog_VH, position: Int) {
        val item = images[position]
        holder.bine(item)
    }

    override fun getItemCount(): Int = images.size
}