package com.example.myapplication.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.Model.ComparacionTextoModel

class MainViewModel : ViewModel() {

    private val _resultado = MutableLiveData<String>()
    val resultado: LiveData<String> = _resultado

    fun comprarTextos(ed1: String, ed2: String) {
        val comparacion = ComparacionTextoModel(ed1, ed2)
        val resultadoComparacion = if (ed1 == ed2) {
            "Los textos son iguales"
        } else {
            "Los textos son diferentes"
        }
        _resultado.value = resultadoComparacion
    }

}