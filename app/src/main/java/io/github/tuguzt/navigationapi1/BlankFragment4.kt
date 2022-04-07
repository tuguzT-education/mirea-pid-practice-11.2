package io.github.tuguzt.navigationapi1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import io.github.tuguzt.navigationapi1.databinding.FragmentBlank4Binding

class BlankFragment4 : Fragment() {
    private var _binding: FragmentBlank4Binding? = null
    private val binding get() = _binding!!

    private var returnData: String? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentBlank4Binding.inflate(inflater, container, false)

        findNavController(this)
            .currentBackStackEntry
            ?.savedStateHandle
            ?.getLiveData<String>("result_from_activity")
            ?.observe(viewLifecycleOwner) { returnData = it }
        if (returnData != null) {
            Toast.makeText(context, returnData, Toast.LENGTH_LONG).show()
        }

        binding.button6.setOnClickListener {
            val bundle = bundleOf("arg1" to binding.et.text?.toString())
            it.findNavController().navigate(R.id.action_blankFragment4_to_main2Activity, bundle)
        }
        binding.button6Up.setOnClickListener {
            it.findNavController().navigateUp()
        }
        binding.button7.setOnClickListener {
            it.findNavController().navigate(R.id.action_blankFragment4_to_blankFragment32)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
