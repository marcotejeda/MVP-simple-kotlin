package com.marcotejeda.mvp_simple_kotlin.presentation.presenter

interface Presenter {
    fun calculateOperation(data: String)
    fun showResult(result: String)
    fun showError(error: String)
}