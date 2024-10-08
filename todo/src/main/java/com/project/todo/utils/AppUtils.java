package com.project.todo.utils;

import java.util.Random;

public class AppUtils {
    public static String generateOtp(){
        String numbers = "0123456789";
        char[] otp = new char[6];
        Random randomNumber = new Random();
        for(int i=0;i<6;i++){
            otp[i] = numbers.charAt(randomNumber.nextInt(numbers.length()));
        }
        return new String(otp);
    }
}
