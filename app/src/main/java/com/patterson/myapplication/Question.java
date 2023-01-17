package com.patterson.myapplication;

public class Question {

    private String qText;
    private int correctAnswer;
    private int wrongAnswer1;
    private int wrongAnswer2;
    private int wrongAnswer3;



    public Question() {
        qText = "Question undefined";
        correctAnswer = 32;
        wrongAnswer1 = 18;
        wrongAnswer2 = 24;
        wrongAnswer3 = 12;
    }


    public Question(String qText, int correctAnswer, int wrongAnswer1, int wrongAnswer2, int wrongAnswer3) {
        this.qText = qText;
        this.correctAnswer = correctAnswer;
        this.wrongAnswer1 = wrongAnswer1;
        this.wrongAnswer2 = wrongAnswer2;
        this.wrongAnswer3 = wrongAnswer3;
    }

    public String getQText() {
        return qText;
    }
    public int correctAnswer() {
        return correctAnswer;
    }

    public int getWrongAnswer1() {
        return wrongAnswer1;
    }

    public void setWrongAnswer1(int wrongAnswer1) {
        this.wrongAnswer1 = wrongAnswer1;
    }

    public int getWrongAnswer2() {
        return wrongAnswer2;
    }

    public void setWrongAnswer2(int wrongAnswer2) {
        this.wrongAnswer2 = wrongAnswer2;
    }

    public int getWrongAnswer3() {
        return wrongAnswer3;
    }

    public void setWrongAnswer3(int wrongAnswer3) {
        this.wrongAnswer3 = wrongAnswer3;
    }

    public void setQText(String newQText) {
        qText = newQText;
    }
    public void setCorrectAnswer(int newCorrectAnswer) {
        correctAnswer = newCorrectAnswer;
    }
    @Override
    public String toString() {
        return "The question text is " + qText + ". The correct answer is " + correctAnswer + ".";
    }
}
