package com.example.fitfrenzy.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.fitfrenzy.R
import com.example.fitfrenzy.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.home = this

        return binding.root
    }

    fun btnPressed(option: String) {
        when (option) {
            "start" -> findNavController().navigate(R.id.action_homeFragment_to_exerciseFragment)
            "bmi" -> findNavController().navigate(R.id.action_homeFragment_to_bmiFragment)
            "history" -> findNavController().navigate(R.id.action_homeFragment_to_historyFragment)
        }
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}