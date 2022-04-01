package com.haider.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.haider.navigationcomponent.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    val args: SecondFragmentArgs by navArgs()
    lateinit var binding: FragmentSecondBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentSecondBinding.inflate(layoutInflater)

        val number = args.number

        binding.FragmentId.text = number.toString()

        binding.secondFragment.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.navigateToFirstFragment)
        }
        return binding.root
    }

}