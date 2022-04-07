package io.github.tuguzt.navigationapi1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import io.github.tuguzt.navigationapi1.databinding.FragmentBlank2Binding

class BlankFragment2 : Fragment() {
    private var _binding: FragmentBlank2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentBlank2Binding.inflate(inflater, container, false)

        binding.button2.setOnClickListener {
            it.findNavController().navigate(R.id.action_blankFragment2_to_main2Activity)
        }
        binding.button2Back.setOnClickListener { it.findNavController().popBackStack() }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
