package com.example.a5m_1dz

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.graphics.green
import androidx.core.graphics.toColor
import com.example.a5m_1dz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {
    private val presenter = Injector.getPresenter()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.fillCounterView(this)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            btnIncrement.setOnClickListener {
                presenter.increment()
            }
            btnDecrement.setOnClickListener {
                presenter.decrement()
            }
        }
    }

    override fun showNewCount(count: Int) {
        binding.tvResult.text = count.toString()
//        if (count == 10)
//            Toast.makeText(applicationContext, "Поздравляем!", Toast.LENGTH_SHORT)
//                .show()
//
//        if (count == 15){
//            val exampleTxt: TextView = findViewById<TextView>(R.id.tv_result)
//            exampleTxt.setTextColor(Color.parseColor("#04870A"))
//        }
    }

    override fun showToast(toast: String) {
        Toast.makeText(applicationContext, toast, Toast.LENGTH_SHORT).show()
    }

    override fun showColor(color: Int) = binding.tvResult.setTextColor(color)

}
