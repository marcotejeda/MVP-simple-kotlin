package com.marcotejeda.mvp_simple_kotlin.presentation.presenter

import com.marcotejeda.mvp_simple_kotlin.domain.interactor.OperationCallback
import com.marcotejeda.mvp_simple_kotlin.domain.interactor.OperationInteractor
import com.marcotejeda.mvp_simple_kotlin.presentation.view.MainView

class OperationPresenter: Presenter {

    var mainView: MainView
    var operationCallback: OperationCallback

    constructor(view: MainView) {
        this.mainView = view
        operationCallback = OperationInteractor(this)
    }

    override fun calculateOperation(data: String) {
        operationCallback.operationResult(data)
    }

    override fun showResult(result: String) {
        mainView.showResult(result)
    }

    override fun showError(error: String) {
        mainView.showResult(error)
    }
}