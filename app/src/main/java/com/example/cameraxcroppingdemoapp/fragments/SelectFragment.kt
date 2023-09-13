package com.example.cameraxcroppingdemoapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.cameraxcroppingdemoapp.R
//import kotlinx.android.synthetic.main.fragment_select.btnCircular

import com.example.cameraxcroppingdemoapp.databinding.FragmentSelectBinding

//import kotlinx.android.synthetic.main.fragment_select.*

class SelectFragment : Fragment() {
    private var _binding: FragmentSelectBinding? = null
    private val binding get() = _binding!!

/*
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_select, container, false)
*/

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding= FragmentSelectBinding.inflate(inflater, container, false)
        val view = binding.root

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCircular.setOnClickListener {
            Navigation.findNavController(requireActivity(), R.id.fragment_container)
                .navigate(SelectFragmentDirections.selectToPermission())

        }
        binding.btnSquare.setOnClickListener {
            Navigation.findNavController(requireActivity(), R.id.fragment_container)
                .navigate(SelectFragmentDirections.selectToPermission())

        }
        binding.btnRectangle.setOnClickListener {
            Navigation.findNavController(requireActivity(), R.id.fragment_container)
                .navigate(SelectFragmentDirections.selectToPermission())
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}