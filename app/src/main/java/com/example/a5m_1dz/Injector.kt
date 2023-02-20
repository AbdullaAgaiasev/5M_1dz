package com.example.a5m_1dz

class Injector {
    companion object {
        fun getPresenter(): Presenter {
            return Presenter()
        }

        fun getModel(): Model {
            return Model()
        }
    }
}