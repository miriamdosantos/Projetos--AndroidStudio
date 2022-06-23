package com.generation.todolist

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.generation.todolist.databinding.FragmentFormBinding
import com.generation.todolist.fragment.DatePickerFragment
import com.generation.todolist.fragment.TimePickerListener
import com.generation.todolist.model.Categoria
import com.generation.todolist.model.Tarefa
import java.time.LocalDate
import java.util.logging.Level


class FormFragment : Fragment(), TimePickerListener {

    private lateinit var binding: FragmentFormBinding
    private val mainViewModel: MainViewModel by activityViewModels()
    private var categoriaSelecionada = 0L
    private var tarefaSelecionada: Tarefa? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFormBinding.inflate(layoutInflater, container, false)
        carregarDados()
        binding.editData.setOnClickListener {

            DatePickerFragment(this).show(parentFragmentManager, "DatePicker")

        }

        mainViewModel.listCategoria()

        mainViewModel.dataSelecionada.value = LocalDate.now()

        mainViewModel.myCategoriaResponse.observe(viewLifecycleOwner) { response ->

            Log.d("Requisição", response.body().toString())
            spinnerCategoria(response.body())

        }

        mainViewModel.dataSelecionada.observe(viewLifecycleOwner) {

                selectdate ->
            binding.editData.setText(selectdate.toString())

        }


        binding.buttonSalvar.setOnClickListener {

            inserirNoBanco()

        }

        return binding.root
    }


    private fun spinnerCategoria(listCategoria: List<Categoria>?) {

        if (listCategoria != null) {

            binding.spinnerCategoria.adapter = ArrayAdapter(
                requireContext(),
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                listCategoria
            )
        }

        binding.spinnerCategoria.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {

                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {

                    val selected = binding.spinnerCategoria.selectedItem as Categoria

                    categoriaSelecionada = selected.id

                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }


    }

    private fun validarCampos(
        nomeTarefa: String,
        descriçãoTarefa: String,
        responsavel: String
    ): Boolean {

        return !(nomeTarefa == "" || nomeTarefa.length < 3 || nomeTarefa.length > 20) ||
                (descriçãoTarefa == "" || descriçãoTarefa.length < 5 || descriçãoTarefa.length > 200) ||
                (responsavel == "" || responsavel.length < 5 || responsavel.length > 20)
    }

    private fun inserirNoBanco() {

        val nome = binding.editNome.text.toString()
        val descriçãoTarefa = binding.editDescricao.text.toString()
        val responsavel = binding.editResponsavel.text.toString()
        val data = binding.editData.text.toString()
        val status = binding.switchAtivoCard.isChecked
        val categoria = Categoria(categoriaSelecionada, null, null)

        if (validarCampos(nome, descriçãoTarefa, responsavel)) {
 val salvar :String
  if(tarefaSelecionada!=null){
      salvar = "Tarefa Atualizada"
      val tarefa = Tarefa(tarefaSelecionada?.id!!, nome,descriçãoTarefa, responsavel, data, status, categoria)
mainViewModel.updateTarefa(tarefa)
  }else{
      salvar = "Tarefa Criada"
      val tarefa = Tarefa(0, nome, descriçãoTarefa, responsavel, data, status, categoria)
      mainViewModel.addTarefa(tarefa)
  }

            Toast.makeText(context, salvar, Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_formFragment_to_listFragment)


        } else {

            Toast.makeText(context, "Preencha os campos corretamente", Toast.LENGTH_LONG).show()

        }

    }


    override fun onDateSelectd(date: LocalDate) {
        mainViewModel.dataSelecionada.value = date

    }

    private fun carregarDados() {
        tarefaSelecionada = mainViewModel.tarefaSelecionada
        if (tarefaSelecionada != null) {
            binding.editNome.setText(tarefaSelecionada?.nome)
            binding.editDescricao.setText(tarefaSelecionada?.descricao)
            binding.editResponsavel.setText(tarefaSelecionada?.responsavel)
            binding.editData.setText(tarefaSelecionada?.data)
            binding.switchAtivoCard.isChecked = tarefaSelecionada?.status!!
        }
    }
}