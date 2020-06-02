package jp.techacademy.tsumura.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun OnClick(v:View) {

        var answer={
            if(v.id==R.id.button1){
                "Edittext1+Edittext2"
            }else if(v.id==R.id.button2){
                "Edittext1-Edittext2"
            }else if(v.id==R.id.button3){
                "Edittext1*Edittext2"
            }else if(v.id==R.id.button4){
                "Edittext1/Edittext2"
            }

        }

        val intent=Intent(this.Answer::class.java)
        Intent.putExtra("answer",Double)
        startActivity(intent)

    }
}
