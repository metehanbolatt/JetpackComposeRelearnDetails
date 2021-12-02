package com.metehanbolat.jetpackcomposedetailsrelearn

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val textFieldState = MutableLiveData("")

    fun onTextChanged(newText: String){
        textFieldState.value = newText
    }
}