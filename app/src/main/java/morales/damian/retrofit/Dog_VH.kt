package morales.damian.retrofit

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import morales.damian.retrofit.databinding.ItemDogBinding

class Dog_VH (view: View): RecyclerView.ViewHolder(view) {
    private val binding = ItemDogBinding.bind(view)

    fun bine(image:String){
        Picasso.get().load(image).into(binding.ivDog)
    }
}