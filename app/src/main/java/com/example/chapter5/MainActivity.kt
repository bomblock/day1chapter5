package com.example.chapter5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.example.chapter5.databinding.ActivityMainBinding
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val firstNumberText = StringBuilder("")
    private val secondNumberText = StringBuilder("")
    private val operatorText = StringBuilder("")
    //todo 값을 받고 다음 값을 받은 다음 연산자 을 받는 구조 로 진행


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun numberClicked(view: View) {
        val nuberString = (view as? Button)?.text.toString() ?: ""
        val nuberText = if(operatorText.isEmpty()) firstNumberText
    }
    fun clearClicked(view: View) {

    }
    fun equslClicked(view: View) {

    }
    fun operatorClicked(view: View) {

    }
}