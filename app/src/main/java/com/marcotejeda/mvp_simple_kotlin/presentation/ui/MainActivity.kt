package com.marcotejeda.mvp_simple_kotlin.presentation.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.marcotejeda.mvp_simple_kotlin.R
import com.marcotejeda.mvp_simple_kotlin.presentation.presenter.OperationPresenter
import com.marcotejeda.mvp_simple_kotlin.presentation.presenter.Presenter
import com.marcotejeda.mvp_simple_kotlin.presentation.view.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {

    lateinit var presenter: Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = OperationPresenter(this)

        btnCalculate.setOnClickListener {
            presenter.calculateOperation(etNumber.text.toString())
        }

    }

    override fun showResult(result: String) {
        tvResult.text = result
    }
}
