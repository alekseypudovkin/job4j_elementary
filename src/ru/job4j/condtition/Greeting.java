package ru.job4j.condtition;

public class Greeting {

    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public static void main(String[] args) {
        int year = 2021;
        String idea = "I like Java!" + year;
        String but = " But I am a newbie.";
        System.out.println(idea + but);
        // ИЛИ так)
        System.out.println(idea + " But I am a newbie.");
        System.out.println(idea);

    }
}
