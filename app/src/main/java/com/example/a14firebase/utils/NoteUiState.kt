package com.example.a14firebase.utils
//UiStateForOurUi
sealed class UiState<out T>{
    //Loading, Success, Failure
    object Loading: UiState<Nothing>()
    data class Success<out T>(val data : T): UiState<T>()
    data class Failure(val error: String?): UiState<Nothing>()
}
