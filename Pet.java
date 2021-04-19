package com.tts;

public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;
    //constructors
    public Pet() {
        this.name = "nonameentered";
        this.age = -1;
        this.location = "nolocationentered";
        this.type = "notypeenterred";
    }

    public Pet(String name, int age, String location, String type) {
        name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }
    //getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getType() {
        return this.type;
    }
    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
