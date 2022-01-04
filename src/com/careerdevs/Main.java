package com.careerdevs;

public class Main {
// 1/3 JavaBasics
    public static void main(String[] args) {
        // write your code here
        String firstName = "Bill ";
        String lastName = "Ford";
        String fullName = firstName + lastName;

// 1/3 JavaBasics
        System.out.println(fullName);

// 2/3 JavaBasics
        System.out.println(createFullName("Gabriel", "Sherman"));

    }

// 2/3 JavaBasics
    public static String createFullName(String First, String Last) {
        String fullName = First + " " + Last;
        return fullName;
    }
}

