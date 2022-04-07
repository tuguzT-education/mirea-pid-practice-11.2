package io.github.tuguzt.navigationapi1.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import io.github.tuguzt.navigationapi1.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {
    private var _binding: FragmentSlideshowBinding? = null
    private val binding get() = _binding!!

    private val slideshowViewModel: SlideshowViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)

        slideshowViewModel.text.observe(viewLifecycleOwner) {
            binding.textSlideshow.text = it
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
