package com.tts;

public class VideoGame {
    private String gameName;
    private int yearOfRelease;
    private String mainCharacter;

    public VideoGame() {
        this.gameName = "";
        this.yearOfRelease = -1;
        this.mainCharacter = "";
    }

    public VideoGame(String gameName, int yearOfRelease, String mainCharacter) {
        this.gameName = gameName;
        this.yearOfRelease = yearOfRelease;
        this.mainCharacter = mainCharacter;
    }

    public VideoGame(String gameName, String mainCharacter) {
        this.gameName = gameName;
        this.mainCharacter = mainCharacter;
        this.yearOfRelease = -1;
    }
    //getters
    public String getGameName() {
        return this.gameName;
    }

    public int getYearOfRelease() {
        return this.yearOfRelease;
    }

    public String getMainCharacter() {
        return this.mainCharacter;
    }
    //setters
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setMainCharacter(String mainCharacter) {
        this.mainCharacter = mainCharacter;
    }

    public boolean gameNameExists() {
        if (gameName.equals("")) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Game name: " + this.gameName + "\n" +
                "Year of release: " + yearOfRelease + "\n"
                + "Main Character: " + this.mainCharacter;
    }
}
