package com.generation.todoandroid.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.generation.todoandroid.databinding.CardBinding
import com.generation.todoandroid.model.Tarefa

class TarefaAdapter : RecyclerView.Adapter<TarefaAdapter.MyViewHolder>() {
   private var listTarefa = emptyList<Tarefa>()
    class MyViewHolder(val binding: CardBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder (CardBinding.inflate(LayoutInflater.from(parent.context), parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
     val tarefa = listTarefa [position]
        holder.binding.textNome.text = tarefa.nome
        holder.binding.textDescricao.text = tarefa.descricao
        holder.binding.textResponsavel.text= tarefa.responsavel
        holder.binding.textData.text = tarefa.data
        holder.binding.switchAtivo.isChecked = tarefa.status
        holder.binding.textCategoria.text = tarefa.categoria.descricao
    }

    override fun getItemCount(): Int {
        return listTarefa.size
    }
    fun setList (list: List <Tarefa>){
        listTarefa = list
        notifyDataSetChanged()
    }


}