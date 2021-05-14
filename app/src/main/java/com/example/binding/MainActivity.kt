package com.example.binding

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       textView.text="10"
      //  textView.setTextColor(getColor.(R.color.purple_200));
textView.isVisible=false
        textView.textSize=22f

        with(textView){
            text="10"

            isVisible=false
            textSize=22f
        }

        textView.apply{
            text="10"
            //  textView.setTextColor(getColor.(R.color.purple_200));
            isVisible=false
            textSize=22f
        }

        editTextTextPersonName.apply{
            isEnabled=false      //disable editText at Run Time
            hint="Enter your Name"
            setText("DEEPALI")

           addTextChangedListener {
Log.i("View Binding",it.toString())
           }
        }

        btn.setOnClickListener{
            Toast.makeText(this,"hello2",Toast.LENGTH_SHORT).show()
        }

        btn3.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v:View){
Toast.makeText(v.context,"hello3 from anonomyns functn",Toast.LENGTH_SHORT).show()
            }
        })

        btn4.setOnClickListener(this)
    }

    fun click(view: View) {
        Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show()
    }


    override fun onClick(v: View?) {
        Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show()
    }


}