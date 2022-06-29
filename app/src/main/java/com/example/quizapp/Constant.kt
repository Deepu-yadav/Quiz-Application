package com.example.quizapp

object Constant {

    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTION:String="totale_question"
    const val CORRECT_ANSWER:String="correct_answer"


    fun getQuestions():ArrayList<Question>{
        val questionlist=ArrayList<Question>()

        val qu1=Question(1,"What country does this flag belong to ?",R.drawable.ic_argent_image
        ,"Argentina","Australia","Armenia","Austria",1)

        questionlist.add(qu1)
        //2
        val qu2=Question(2,"What country does this flag belong to ?",R.drawable.ic_austalia_image
            ,"Angola","Austria","Australia","Armenia",1)

        questionlist.add(qu2)

        //3
        val qu3=Question(3,"What country does this flag belong to ?",R.drawable.ic_brazil_image
            ,"Belarus","Belize","Brunei","Brazil",1)

        questionlist.add(qu3)
        //4

        val qu4=Question(4,"What country does this flag belong to ?",R.drawable.ic_belgium_image
            ,"Bahamas","Belgium","Barbados","Belize",2)

        questionlist.add(qu4)

        //5
        val qu5=Question(5,"What country does this flag belong to ?",R.drawable.ic_fiji_image
            ,"Gabon","France","Fiji","Finland",3)

        questionlist.add(qu5)

        //6

        val qu6=Question(6,"What country does this flag belong to ?",R.drawable.ic_germani_image
            ,"Germany","Georgia","Greece","none of these",1)

        questionlist.add(qu6)

        //7

        val qu7=Question(7,"What country does this flag belong to ?",R.drawable.ic_denmark_image
            ,"Dominica","Egypt","Denmark","Ethiopia",3)

        questionlist.add(qu7)

        //8

        val qu8=Question(8,"What country does this flag belong to ?",R.drawable.ic_india_image
            ,"Ireland","Iran","Hungary","India",4)

        questionlist.add(qu8)

        //9
        val qu9=Question(9,"What country does this flag belong to ?",R.drawable.ic_newzealand_image
            ,"Austrlia","New Zealand","Tuvalu","United State of Ameriaca",2)



        questionlist.add(qu9)

        //10
        val qu10=Question(10,"What country does this flag belong to ?",R.drawable.ic_kuwati_image
            ,"Kuwait","jordan","Sudan","Palestine",1)

        questionlist.add(qu10)

        return questionlist
    }

}