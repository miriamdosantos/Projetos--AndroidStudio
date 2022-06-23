package com.generation.sqlitecomroom.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.generation.sqlitecomroom.data.Usuario
import com.generation.sqlitecomroom.databinding.CardLayoutBinding

class UserAdapter : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    class UserViewHolder (val binding : CardLayoutBinding)
        : RecyclerView.ViewHolder (binding.root)
     private var listUser = emptyList<Usuario>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(CardLayoutBinding.inflate
            ( LayoutInflater.from(parent.context), parent, false))

    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
       val user =listUser [position]
        holder.binding.textId.text = user.id.toString()
        holder.binding.textNome1.text = user.nome
        holder.binding.textSobrenome1 .text = user.sobrenome
        holder.binding.textViewIdade1.text = user.idade.toString()
    }

    override fun getItemCount(): Int {
       return listUser.size
    }
    fun setList(list:List<Usuario>){
        listUser =list
        notifyDataSetChanged()
    }
}