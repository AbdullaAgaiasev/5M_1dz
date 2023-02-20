package com.example.a5m_1dz

import android.graphics.Color

class Presenter {

    private val model = Injector.getModel()
    private lateinit var counterView: CounterView
    fun increment(){
        model.increment()
        counterView. showNewCount (model.count)
        if (model.count == 10){
            counterView.showToast("Поздравляем!")
        }
        if (model.count == 15) {
            counterView.showColor(Color.GREEN)
        }
    }
        fun decrement(){
            model.decrement()
            counterView.showNewCount(model.count)
            if (model.count <= 15) {
                counterView.showColor(Color.RED)
            }
            }
            fun fillCounterView(counterView: CounterView){
                this.counterView = counterView
        }
    }
