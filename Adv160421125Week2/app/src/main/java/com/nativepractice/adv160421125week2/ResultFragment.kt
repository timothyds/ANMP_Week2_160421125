package com.nativepractice.adv160421125week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.nativepractice.adv160421125week2.databinding.FragmentResultBinding

class ResultFragment : Fragment() {
    private lateinit var binding: FragmentResultBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentResultBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnBack.setOnClickListener {
            val action = ResultFragmentDirections.actionmainFragment()
            Navigation.findNavController(it).navigate(action)
        }
        if(arguments != null) {
            val playerScore = ResultFragmentArgs.fromBundle(requireArguments()).playerScore
            binding.txtScore.text = "Your score is $playerScore"
        }

    }
}