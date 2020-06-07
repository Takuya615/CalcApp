package jp.techacademy.tsumura.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_answer.*
import android.view.View

class Answer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        val num=intent.getIntExtra("答え",0)
        answer.text="ans"
    }
}
