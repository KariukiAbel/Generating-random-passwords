package com.nabesh;

import java.util.Random;

public class Main{

    public static char[] generateRandomPassword(int length) {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "~!@#$%^&*()_+{}|:<>?-=[];./,*-";
        String number = "0123456789";
        String combinedCharacters = upperCase + lowerCase + specialCharacters + number;
        Random random = new Random();
        char [] password =new char[length];

        password[0] = lowerCase.charAt(random.nextInt(lowerCase.length()));
        password[1] = upperCase.charAt(random.nextInt(upperCase.length()));
        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[3] = number.charAt(random.nextInt(number.length()));

        for (int i = 0; i < length; i++) {
            password[i] = combinedCharacters.charAt(random.nextInt(combinedCharacters.length()));
        }
        return password;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(generateRandomPassword(8));
    }
}
