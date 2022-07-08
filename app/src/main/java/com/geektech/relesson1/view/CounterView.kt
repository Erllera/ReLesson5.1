package com.geektech.relesson1.view

interface CounterView {
    fun updateText(count: String)
    fun showToast(toastNumber: String)
    fun colorText(colorNumber: String)
}