package io.github.tuguzt.navigationapi1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import io.github.tuguzt.navigationapi1.databinding.FragmentBlank3Binding

class BlankFragment3 : Fragment() {
    private var _binding: FragmentBlank3Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentBlank3Binding.inflate(inflater, container, false)

        binding.button4.setOnClickListener {
            it.findNavController().navigate(R.id.action_blankFragment3_to_main2Activity)
        }
        binding.button4Back.setOnClickListener {
            it.findNavController().popBackStack()
        }

        // отправка данных обратно
        findNavController().previousBackStackEntry?.savedStateHandle?.set("result_from_activity", "ответные данные")

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
