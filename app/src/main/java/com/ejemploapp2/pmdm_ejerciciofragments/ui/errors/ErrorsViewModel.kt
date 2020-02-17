package com.ejemploapp2.pmdm_ejerciciofragments.ui.errors

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//El view model es la estructura de la UI del fragment, aqui en este ejemplo modificamos el TextView
class ErrorsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is errores Fragment"
    }
    val text: LiveData<String> = _text
}