package io.github.tuguzt.navigationapi1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import io.github.tuguzt.navigationapi1.databinding.FragmentBlank1Binding

class BlankFragment1 : Fragment() {
    private var _binding: FragmentBlank1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentBlank1Binding.inflate(inflater, container, false)

        binding.button.setOnClickListener {
            it.findNavController().navigate(R.id.action_blankFragment_to_blankFragment2)
        }
        binding.button3.setOnClickListener {
            it.findNavController().navigate(R.id.action_blankFragment_to_blankFragment3)
        }
        val listener = Navigation.createNavigateOnClickListener(R.id.action_blankFragment_to_blankFragment4)
        binding.button5.setOnClickListener(listener)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
