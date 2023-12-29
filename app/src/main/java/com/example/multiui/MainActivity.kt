package com.example.multiui

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.multiui.MainActivity.constant.extraName
import com.example.multiui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addCallbacks()
        Log.d(log_tag,"onCreate: ")
    }
    private fun addCallbacks(){
        binding.button.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.google.com")
            startActivity(intent)
            binding.btnCall.setOnClickListener {
                val intent=Intent(Intent.ACTION_DIAL)
                val phoneNumber=binding.textPhone.text.toString()
                intent.data=Uri.parse("tel:$phoneNumber")
            }
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
        const val log_tag="FIRST_ACTIVITY"
    }
    object constant{
        val extraName="extra name"
    }
}