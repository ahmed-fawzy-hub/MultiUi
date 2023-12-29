package com.example.multiui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.multiui.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val name=intent.getStringExtra(MainActivity.constant.extraName)
        binding.textData.text=name
        addCallbacks()
        Log.d(MainActivity.log_tag,"onCreate: ")
    }

    private fun addCallbacks(){
        binding.btnClose.setOnClickListener {
            finish()
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d(log_tag, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(log_tag, "onResume: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(log_tag,"onStop: ")

    }

    override fun onPause() {
        super.onPause()
        Log.d(log_tag,"onPause: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(log_tag,"onRestart: ")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(log_tag,"onDestoy: ")
    }
    companion object{
        const val log_tag="SECOND_ACTIVITY"
    }

}