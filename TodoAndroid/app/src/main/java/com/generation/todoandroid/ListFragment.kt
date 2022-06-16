package com.generation.todoandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.generation.todoandroid.adapter.TarefaAdapter
import com.generation.todoandroid.databinding.FragmentListBinding
import com.generation.todoandroid.model.Categoria
import com.generation.todoandroid.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListFragment : Fragment() {
   private lateinit var binding : FragmentListBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(layoutInflater, container, false)
      // exemplo de uma varivel para exibir na tela com view:
      //  val view = inflater.inflate(R.layout.fragment_list, container, false)
        //val floatingAdd = view.findViewById<FloatingActionButton>(R.id.floatingAdd)
        /* modo manual
       var listTarefas = listOf (
            Tarefa(0 +
                    "",
                "Lavar a louca do dia todo",
                "Lavar a louca do dia todo""Miriam",
                "2022-05-15",
                false,
                Categoria(1, "Lazer",{0} )

        ),
            Tarefa("Ir ao Cinama",
                "Com o meu pai",
                "Miriam",
                "2022-05-16",
                false,
                "Lazer"
            ),
            Tarefa("Lavar a louca",
                "Lavar a louca do dia todo",
                "Miriam",
                "2022-05-15",
                true,
                "Dia a Dia")


        )

         */
        //configuracao do recyclerview
        val adapter = TarefaAdapter ()
        binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)
        binding.recyclerTarefa.adapter = adapter
        binding.recyclerTarefa.setHasFixedSize(true)
        //adapter.setList(listTarefas)
        binding.floatingAdd.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_formFragment6)
        }
        // jeito com a view para retorno:
       // return view
        // retorno com a binding
        return binding.root
    }

    }
