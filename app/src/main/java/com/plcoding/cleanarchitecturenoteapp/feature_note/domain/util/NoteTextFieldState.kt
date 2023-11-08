package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)
