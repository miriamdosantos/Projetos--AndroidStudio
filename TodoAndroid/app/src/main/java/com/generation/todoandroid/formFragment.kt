package com.generation.todoandroid

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.generation.todoandroid.databinding.FragmentFormBinding
import com.generation.todoandroid.databinding.FragmentListBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [formFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class formFragment : Fragment() {
    private lateinit var binding : FragmentFormBinding
    private  val mainViewModel : MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFormBinding.inflate(layoutInflater, container, false)
        //val view = inflater.inflate(R.layout.fragment_form, container, false)
       // val buttonSalvar = view.findViewById<Button>(R.id.buttonSalvar)
        mainViewModel.myCategoriaResponse.observe(viewLifecycleOwner){
            Log.d("Requisicao", it.body().toString())
        }
        binding.buttonSalvar.setOnClickListener {
            findNavController().navigate(R.id.action_formFragment_to_listFragment2)
        }
        return binding.root
    }


    }
