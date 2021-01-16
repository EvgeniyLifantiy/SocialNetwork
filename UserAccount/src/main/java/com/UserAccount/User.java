package com.UserAccount;
import java.util.ArrayList;
import java.util.List;

public class User  {

    private String name;

    private String surname;

    private int age;

    private List<User> friendlist =new ArrayList<>();

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getProfile() {
        return getName()+" "+getSurname()+" "+getAge();
    }


    public List<User> getFriendlist() {
        return friendlist;
    }

    public void addtoFriendList(User user){
        getFriendlist().add(user);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        age = age;
    }



}
