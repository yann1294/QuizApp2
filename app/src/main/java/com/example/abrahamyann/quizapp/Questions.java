package com.example.abrahamyann.quizapp;

/**
 * Created by Abraham on 18/03/18.
 */

public class Questions {
    public String mQuestions [] = {
      "Who's the first president of Ivory Coast?",
      "Which town is known as Capital of the mode?",
      "Which major event occurred in 1945?",
      "What's the name of the 44th US president?",
      "How old was Jesus when he died?",
      "What is the first planet of the solar system?"
    };
    public String mChoices [][] = {
            {"Henry Konan Bedie","Hamed Bakayoko","Alassane Ouattara","Houphouet Boigny"},
            {"New York","Abidjan","Paris","Bangkok"},
            {"World War 3", "Cold War", "World War 1", "World War 2"},
            {"George Bush", "Bakayoko Yaya", "Barack Obama", "Hillary Clinton"},
            {"22 years", "44 years", "18 years", "33 years"},
            {"Mercury","Venus","Mars","Saturn"}
    };

    private String mCorrectAnswers [] = {"Houphouet Boigny","Paris","World War 2","Barack Obama","33 years","Mercury"};

    public String getQuestions(int a) {
        String question = mQuestions[a];
        return question;
    }
    public String getChoice1 (int a) {
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoice2 (int a) {
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3 (int a) {
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4 (int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer =mCorrectAnswers[a];
        return answer;
    }
}
