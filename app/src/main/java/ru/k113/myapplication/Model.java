package ru.k113.myapplication;

public class Model {

    private String S = "";

    public String getS() { return S; }

    public void setS(String s) {
        S = s;
    }

    String concatS(String text) {//вычисления должны быть в модели
        return S.concat(text);
    }

    }
