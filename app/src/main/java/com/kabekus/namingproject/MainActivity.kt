package com.kabekus.namingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kabekus.namingproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
    fun solution(view: View){
        val name = binding.nameEdtText.text.toString()
        val age = binding.ageEdtText.text.toString().toIntOrNull()
        val job = binding.jobEdtText.text.toString()
        val person = Person(name,age,job)
        binding.resultTxt.text = "Name: ${name},\nAge: ${age},\nJob: ${job}"

    }
}