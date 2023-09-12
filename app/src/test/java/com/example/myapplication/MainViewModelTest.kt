package com.example.myapplication

import com.example.myapplication.view.MainViewModel
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MainViewModelTest(val hello: String, val Hello: String) {

    private lateinit var viewModel: MainViewModel

    @Before
    fun setup(){
        viewModel = MainViewModel()
    }

    @Test
    fun compararTexto_ed1IgualAed2(){
        viewModel.comprarTextos(hello, hello)
        val resultadoEsperado = "Los textos son iguales"
        assertEquals(resultadoEsperado, viewModel.resultado.value)

    }
    @Test
    fun compararTexto_ed1DistintoDeed2(){
        viewModel.comprarTextos(Hello, hello)
        val resultadoEsperado = "Los textos son diferentes"
        assertEquals(resultadoEsperado,viewModel.resultado.value)
    }

    }