package com.example;

public class UserProfile {
    private String name;
    private String email;
    private int age;
    private int pesel;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public int getPesel() {
        return pesel;
    }

    public UserProfile(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}
