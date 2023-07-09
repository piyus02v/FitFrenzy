package com.example.fitfrenzy.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.fitfrenzy.R
import com.example.fitfrenzy.data.viewmodel.HistoryViewModel
import com.example.fitfrenzy.databinding.FragmentExerciseOverBinding

class ExerciseOverFragment : Fragment() {

    private var _binding: FragmentExerciseOverBinding? = null
    private val binding get() = _binding!!

    private val historyViewModel: HistoryViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExerciseOverBinding.inflate(inflater, container, false)

        binding.btnFinish.setOnClickListener {
            findNavController().navigate(R.id.action_finishFragment_to_homeFragment)
        }

        historyViewModel.insertDateToDatabase()

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}