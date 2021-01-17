package com.UserAccount;
import java.util.ArrayList;
import java.util.List;

public class User  {

    private String name;

    private String surname;

    private int age;

    public void setFriendlist(List<User> friendlist) {
        this.friendlist = friendlist;
    }

    public List<String> getInbox() {
        return inbox;
    }

    public void setInbox(List<String> inbox) {
        this.inbox = inbox;
    }

    private List<User> friendlist =new ArrayList<>();

    private List<String> inbox= new ArrayList<>();

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
