package jp.techacademy.tsumura.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Answer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        textView.text="${intent.getIntExtra("answer",0)}"
    }
}
