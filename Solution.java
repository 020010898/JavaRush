package com.javarush.task.task22.task2202;
/*
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("Амиго и Диего лучшие"));
    }

    public static String getPartOfString(String string){
        if(string == null){
            throw new TooShortStringException();
        }
        String result;
        try {
        String[] str = string.split(" ");
        result = String.format("%s %s %s %s", str[1], str[2], str[3], str[4]);
    }catch (IndexOutOfBoundsException e){
        throw new TooShortStringException();
    }
    return result;
    }

    public static class TooShortStringException extends RuntimeException {

    }
}
