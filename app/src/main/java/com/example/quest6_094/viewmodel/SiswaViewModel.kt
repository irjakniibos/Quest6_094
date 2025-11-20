package com.example.quest6_094.viewmodel

import androidx.lifecycle.ViewModel

class SiswaViewModel : ViewModel() {
    private val _statusUI = MutableStateFlow(Siswa())

    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()

}