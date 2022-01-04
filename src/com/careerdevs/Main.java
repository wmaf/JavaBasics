package com.careerdevs;

public class Main {

    public static void main(String[] args) {
    // 1/3
        String firstName = "Bill ";
        String lastName = "Ford";
        String fullName = firstName + lastName;

    // 1/3 JavaBasics Out
        System.out.println(fullName);

    // 2/3 JavaBasics Out
        System.out.println(createFullName("Gabriel", "Sherman"));

    // 3/3 JavaBasics Out
        System.out.println(NameGenerator.generateFullName("Jim", "Jones"));

    }

// 2/3 JavaBasics
    public static String createFullName(String First, String Last) {
        String fullName = First + " " + Last;
        return fullName;
    }


}
// 3/3
class NameGenerator{
    public static String generateFullName(String First, String Last) {
        String theFullNameIs = First + " " + Last;
        return theFullNameIs;
    }
}

//No Go Bonus  :-(