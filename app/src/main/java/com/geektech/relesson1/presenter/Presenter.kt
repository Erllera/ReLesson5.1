package com.geektech.relesson1.presenter

import com.geektech.relesson1.Injector
import com.geektech.relesson1.view.CounterView

class Presenter {
    private val model = Injector.getModel()
    private lateinit var view: CounterView

    fun increment() {
        model.increment()
        view.updateText(model.getCount().toString())

        if (model.getCount() == model.getToastNumber()) {
            view.showToast(model.getToastNumber().toString())
        }
        if (model.getCount() == model.getColorNumber()) {
            view.colorText(model.getColorNumber().toString())
        }
    }

    fun decrement() {
        model.decrement()
        view.updateText(model.getCount().toString())
        if (model.getCount() == model.getToastNumber()) {
            view.showToast(model.getToastNumber().toString())
        }
        if (model.getCount() == model.getColorNumber()) {
            view.colorText(model.getColorNumber().toString())
        }
    }

    fun attachView(view: CounterView) {
        this.view = view
    }
}