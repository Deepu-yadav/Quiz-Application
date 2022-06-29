package com.example.quizapp

 data class Question (
     val id:Int,
     val question:String,
     val image:Int,
     val optionsOne:String,
     val optionsTwo:String,
     val optionsThree:String,
     val optionsFour:String,
     val CorrectAnswers:Int,
         )