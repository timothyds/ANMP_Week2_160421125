package com.nativepractice.adv160421125week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.nativepractice.adv160421125week2.databinding.FragmentGameBinding
import kotlin.random.Random

/**
 * A simple [Fragment] subclass.
 * Use the [GameFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GameFragment : Fragment() {
    private lateinit var binding: FragmentGameBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var num1 = Random.nextInt(10)
        var num2 = Random.nextInt(10)
        var quiz = (num1 + num2).toString()
        var score = 0

        binding.txtNum1.text=num1.toString()
        binding.txtNum2.text=num2.toString()

        binding.btnAnswer.setOnClickListener {
            var answer = binding.txtAnswer.text.toString()
            if(answer == quiz){
                score += 1
                num1 = Random.nextInt(10)
                num2 = Random.nextInt(10)
                quiz = (num1 + num2).toString()
                binding.txtNum1.text=num1.toString()
                binding.txtNum2.text=num2.toString()

            }else{
                val action = GameFragmentDirections.actionresultFragment(score.toString())
                Navigation.findNavController(it).navigate(action)
            }
            binding.txtAnswer.setText("")
        }
        if(arguments != null) {
            val playerName = GameFragmentArgs.fromBundle(requireArguments()).playerName
            binding.txtTurn.text = "$playerName's Turn"
        }

    }


}