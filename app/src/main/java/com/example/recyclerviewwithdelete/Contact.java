package com.example.recyclerviewwithdelete;

import androidx.annotation.Nullable;

public class Contact {
    private String name;
    private String age;
    private String gender;
    private String location;
    private Integer imageId;

    public Contact(String name, String age, String gender, String location, @Nullable Integer imageId) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.location = location;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }
}
