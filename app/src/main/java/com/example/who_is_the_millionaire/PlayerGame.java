package com.example.who_is_the_millionaire;

import java.io.Serializable;

public class PlayerGame implements Serializable {
    private int id ;
    private String name ;
    private String Score ;

    public PlayerGame(String name, String score) {
        this.name = name;
        Score = score;
    }

    public PlayerGame(int id, String name, String score) {
        this.id = id;
        this.name = name;
        Score = score;
    }

    public PlayerGame() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return Score;
    }

    public void setScore(String score) {
        Score = score;
    }
}
