package com.anibalventura.t7minutesworkout.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.anibalventura.t7minutesworkout.R
import com.anibalventura.t7minutesworkout.databinding.FragmentExerciseOverBinding

class ExerciseOverFragment : Fragment() {

    private var _binding: FragmentExerciseOverBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExerciseOverBinding.inflate(inflater, container, false)

        binding.btnFinish.setOnClickListener {
            findNavController().navigate(R.id.action_finishFragment_to_homeFragment)
        }

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}