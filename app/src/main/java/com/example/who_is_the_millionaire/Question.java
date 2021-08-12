package com.example.who_is_the_millionaire;

import java.util.ArrayList;

public class Question {
    private int number ;
    private String contentQuestion ;
    private ArrayList<Answser> answserArrayList;

    public Question(int number, String contentQuestion, ArrayList<Answser> answserArrayList) {
        this.number = number;
        this.contentQuestion = contentQuestion;
        this.answserArrayList = answserArrayList;
    }

    public int getNumber() {
        return number;
    }

    public String getContentQuestion() {
        return contentQuestion;
    }

    public ArrayList<Answser> getAnswserArrayList() {
        return answserArrayList;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setContentQuestion(String contentQuestion) {
        this.contentQuestion = contentQuestion;
    }

    public void setAnswserArrayList(ArrayList<Answser> answserArrayList) {
        this.answserArrayList = answserArrayList;
    }

}
