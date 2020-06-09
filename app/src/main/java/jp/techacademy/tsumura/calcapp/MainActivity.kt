package jp.techacademy.tsumura.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity:AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

     override fun onClick(v:View) {

         var num1:Double=Edittext1.text.toString().toDouble()
         var num2:Double=Edittext2.text.toString().toDouble()
         var Ans:Double=0.0

         if (v.id==R.id.button1){
             Ans=num1+num2
         }else if(v.id==R.id.button2){
             Ans=num1-num2
         }else if(v.id==R.id.button3){
             Ans=num1*num2
         }else if(v.id==R.id.button4){
             Ans=num1/num2
         }
         intent=Intent(this,Answer::class.java)
         intent.putExtra("答え",Ans)
         startActivity(intent)
     }

}
