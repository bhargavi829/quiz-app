package com.example.android.quizapp;

public class questions {

    public String mquestions[] = {
            "Which is the first planet in the solar system?",
            "Which is the second planet in the solar system?",
            "Which is the third planet in the solar system?",
            "Which is the fourth planet in the solar system?",
            "Which is the fifth planet in the solar system?",
            "Which is the sixth planet in the solar system?",
            "Which is the seventh planet in the solar system?",
            "Which is the eighth planet in the solar system?",
            "Which is the ninth planet in the solar system?",
    };

    private String mChoices[][] = {
            {"Mercury", "Venus", "Mars", "Saturn"},
            {"Jupiter", "Venus", "Earth", "Neptune"},
            {"Earth", "Jupiter", "Pluto", "Venus"},
            {"Jupiter", "Saturn", "Mars", "Earth"},
            {"Jupiter", "Pluto", "Mercury", "Earth"},
            {"Uranus", "Venus", "Mars", "Saturn"},
            {"Saturn", "Pluto", "Uranus", "Earth"},
            {"Venus", "Neptune", "Pluto", "Mars"},
            {"Mercury", "Venus", "Mars", "Pluto"},
    };

    private String mCorrectAnswers[] = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};

    public String getquestion(int a) {
        String question = mquestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String Choice = mChoices[a][0];
        return Choice;
    }

    public String getChoice2(int a) {
        String Choice = mChoices[a][1];
        return Choice;
    }

    public String getChoice3(int a) {
        String Choice = mChoices[a][2];
        return Choice;
    }

    public String getChoice4(int a) {
        String Choice = mChoices[a][3];
        return Choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }

    }

