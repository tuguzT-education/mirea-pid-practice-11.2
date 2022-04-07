package io.github.tuguzt.navigationapi1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import io.github.tuguzt.navigationapi1.databinding.FragmentBlank6Binding

class BlankFragment6 : Fragment() {
    private var _binding: FragmentBlank6Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentBlank6Binding.inflate(inflater, container, false)

        binding.ButtonBack.setOnClickListener {
            it.findNavController().popBackStack()
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
