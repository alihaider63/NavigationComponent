package com.haider.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.haider.navigationcomponent.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentFirstBinding.inflate(layoutInflater)

        binding.firstFragment.setOnClickListener {
            val action = FirstFragmentDirections.navigateToSecondFragment(78)
            Navigation.findNavController(binding.root).navigate(action)
        }


        return binding.root
    }

}