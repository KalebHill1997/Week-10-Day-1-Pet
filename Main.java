package com.tts;

public class Main {
    public static void main(String[] args) {

        VideoGame whatever = new VideoGame();
        System.out.println(whatever.gameNameExists());

        VideoGame something = new VideoGame("The lords", 1997, "bob");

        System.out.println(something.gameNameExists());
        System.out.println(something.toString());


    }
}
