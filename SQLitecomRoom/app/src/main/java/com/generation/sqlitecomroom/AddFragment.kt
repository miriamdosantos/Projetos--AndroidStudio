package com.generation.sqlitecomroom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.generation.sqlitecomroom.data.Usuario
import com.generation.sqlitecomroom.databinding.FragmentAddBinding


class AddFragment : Fragment() {
private lateinit var binding : FragmentAddBinding
private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAddBinding.inflate(layoutInflater,container,false)
       mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
       // mainViewModel = ViewModelProvider (this).get(MainViewModel::class.java)
        binding.buttonAdicionar.setOnClickListener {
            inserirNoBanco()
        }
        return binding.root
    }
  private fun verificaCampos (nome:String, sobrenome:String, idade:String):Boolean{
      return !(nome =="" || sobrenome ==""|| idade == "")
  }
    private fun inserirNoBanco(){
        val nome = binding.editTextTextPersonName.text.toString()
        val sobrenome = binding.editTextTextPersonName2.text.toString()
        val idade = binding.editTextTextPersonName3.text.toString()

        if(verificaCampos(nome,sobrenome,idade)){
            val user = Usuario(0,nome,sobrenome,idade.toInt())
            mainViewModel.addUser(user)
            Toast.makeText(context, "User adicionado", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_addFragment_to_listFragment)
        }else{
            Toast.makeText(context, "Preencha todos os campos", Toast.LENGTH_LONG).show()
        }
    }
}