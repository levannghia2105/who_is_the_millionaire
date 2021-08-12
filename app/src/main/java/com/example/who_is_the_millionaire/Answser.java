package com.example.who_is_the_millionaire;

public class Answser {
    private String contentAnswser ;
    private boolean isAnswser ;

    public Answser(String contentAnswser, boolean isAnswser) {
        this.contentAnswser = contentAnswser;
        this.isAnswser = isAnswser;
    }

    public String getContentAnswser() {
        return contentAnswser;
    }

    public void setContentAnswser(String contentAnswser) {
        this.contentAnswser = contentAnswser;
    }

    public boolean isAnswser() {
        return isAnswser;
    }

    public void setAnswser(boolean answser) {
        isAnswser = answser;
    }
}

