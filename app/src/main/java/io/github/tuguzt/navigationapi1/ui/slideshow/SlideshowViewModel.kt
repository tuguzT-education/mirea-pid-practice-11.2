package io.github.tuguzt.navigationapi1.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {
    private val _text = MutableLiveData("This is slideshow Fragment")
    val text: LiveData<String> = _text
}
