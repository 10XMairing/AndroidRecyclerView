package com.androidpopcorn.tenx.FirebaseRealTImeExample;

public class Person {
    public String age;
    public String name;

    public Person() {
    }

    public Person(String age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}