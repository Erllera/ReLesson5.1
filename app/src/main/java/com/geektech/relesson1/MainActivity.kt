package com.geektech.relesson1

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.geektech.relesson1.databinding.ActivityMainBinding
import com.geektech.relesson1.presenter.Presenter
import com.geektech.relesson1.view.CounterView

class MainActivity : AppCompatActivity(), CounterView {
    private lateinit var binding: ActivityMainBinding
    lateinit var presenter: Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = Injector.getPresenter()
        presenter.attachView(this)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            incrementBtn.setOnClickListener {
                presenter.increment()

            }
            decrementBtn.setOnClickListener{
                presenter.decrement()
            }
        }
    }

    override fun updateText(count: String) {
        binding.mainText.text = count
    }

    override fun showToast(toastNumber: String) {
        Toast.makeText(this, "Поздравляем", Toast.LENGTH_SHORT).show()
    }

    override fun colorText(colorNumber: String) {
        binding.mainText.setTextColor(Color.GREEN)
    }

}