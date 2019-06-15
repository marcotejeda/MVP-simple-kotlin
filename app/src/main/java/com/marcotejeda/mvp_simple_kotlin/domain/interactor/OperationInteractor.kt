package com.marcotejeda.mvp_simple_kotlin.domain.interactor

import com.marcotejeda.mvp_simple_kotlin.presentation.presenter.Presenter

class OperationInteractor: OperationCallback {

    var presenter: Presenter

    constructor(presenter: Presenter) {
        this.presenter = presenter
    }

    override fun operationResult(data: String) {
        if (data != "") {
            presenter.showResult((data.toDouble() * data.toDouble()).toString())
        } else {
            presenter.showError("No ingresó valor.")
        }
    }
}