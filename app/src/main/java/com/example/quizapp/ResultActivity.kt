package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val username=intent.getStringExtra(Constant.USER_NAME)
        tv_name.text=username
        val totalQuestion=intent.getIntExtra(Constant.TOTAL_QUESTION,0)
        val correctAnswer=intent.getIntExtra(Constant.CORRECT_ANSWER,0)

        tv_score.text="Your Score is $correctAnswer out of $totalQuestion"
        btn_finish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))

        }
    }
}