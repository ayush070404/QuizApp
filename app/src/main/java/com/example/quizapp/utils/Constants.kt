package com.example.quizapp.utils

import com.example.quizapp.R
import com.example.quizapp.model.Question

object Constants {

    const val USER_NAME = "user_name"
    const val TOTAL_QUESTIONS = "total_questions"
    const val SCORE = "correct_answers"

    fun getQuestions(): MutableList<Question> {
        val questions = mutableListOf<Question>()

        // Add all questions
        questions.add(
            Question(1, "What country does this flag belong to?", R.drawable.italy_flag, "Italy", "India", "Iran", "Ireland", 1)
        )
        questions.add(
            Question(2, "What country does this flag belong to?", R.drawable.argentina_flag, "Armenia", "Argentina", "Austria", "Australia", 2)
        )
        questions.add(
            Question(3, "What country does this flag belong to?", R.drawable.brazil_flag, "Belarus", "Belgium", "Bangladesh", "Brazil", 4)
        )
        questions.add(
            Question(4, "What country does this flag belong to?", R.drawable.france_flag, "Finland", "Fiji", "France", "None of the options", 3)
        )
        questions.add(
            Question(5, "What country does this flag belong to?", R.drawable.finland_flag, "Finland", "Fiji", "France", "None of the above to", 1)
        )
        questions.add(
            Question(6, "What country does this flag belong to?", R.drawable.germany_flag, "Gambia", "Germany", "Georgia", "Greece", 2)
        )
        questions.add(
            Question(7, "What country does this flag belong to?", R.drawable.nigeria_flag, "Netherlands", "Nicaragua", "Nigeria", "Nepal.", 3)
        )
        questions.add(
            Question(8, "What country does this flag belong to?", R.drawable.romania_flag, "Russia", "Rwanda", "None of the options", "Romania", 4)
        )
        questions.add(
            Question(9, "What country does this flag belong to?", R.drawable.spain_flag, "Serbia", "Spain", "Saudi Arabia", "Slovenia", 2)
        )
        questions.add(
            Question(10, "What country does this flag belong to?", R.drawable.haiti_flag, "Honduras", "Hungary", "Haiti", "None of the options", 3)
        )

        // 🔀 Shuffle the questions randomly before returning
        questions.shuffle()

        return questions
    }

}