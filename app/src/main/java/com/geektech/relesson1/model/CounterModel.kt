package com.geektech.relesson1.model

class CounterModel {
    private var count = 0
    private var toastNumber = 10
    private var colorNumber = 15

    fun increment() {
        ++count
    }

    fun decrement() {
        --count
    }

    fun getToastNumber(): Int {
        return toastNumber
    }

    fun getColorNumber(): Int {
        return colorNumber
    }

    fun getCount(): Int {
        return count
    }
}