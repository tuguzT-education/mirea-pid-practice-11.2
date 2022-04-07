package io.github.tuguzt.navigationapi1.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {
    private val _text = MutableLiveData("This is gallery Fragment")
    val text: LiveData<String> = _text
}
