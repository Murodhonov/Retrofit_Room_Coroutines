package uz.umarxon.roomcoroutines.base

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import uz.umarxon.roomcoroutines.R
import uz.umarxon.roomcoroutines.data.local.entity.User
import uz.umarxon.roomcoroutines.databinding.ItemLayoutBinding

class UserAdapter(private val list: ArrayList<User>) :
    RecyclerView.Adapter<UserAdapter.Vh>() {
    inner class Vh(var itemRv: ItemLayoutBinding) : RecyclerView.ViewHolder(itemRv.root) {
        fun onBind(user: User, position: Int) {
            itemRv.textViewUserName.text = user.name
            itemRv.textViewUserEmail.text = user.email
            Glide.with(itemRv.imageViewAvatar.context)
                .load(user.avatar)
                .into(itemRv.imageViewAvatar)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size

    fun addData(user:List<User>){
        list.addAll(user)
    }
}