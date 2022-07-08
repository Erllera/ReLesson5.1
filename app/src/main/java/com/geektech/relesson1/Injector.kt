package com.geektech.relesson1

import com.geektech.relesson1.model.CounterModel
import com.geektech.relesson1.presenter.Presenter

class Injector {
    companion object {
        fun getPresenter(): Presenter {
            return Presenter()
        }

        fun getModel(): CounterModel {
            return CounterModel()
        }
    }
}