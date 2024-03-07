package com.nativepractice.adv160421125week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.nativepractice.adv160421125week2.databinding.FragmentMainBinding
import com.nativepractice.adv160421125week2.databinding.FragmentResultBinding
import com.nativepractice.adv160421125week2.databinding.FragmentTestBinding

class TestFragment : Fragment() {
    private lateinit var binding: FragmentTestBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }
}