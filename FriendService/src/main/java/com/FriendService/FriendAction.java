package com.FriendService;

import com.UserAccount.User;

import java.util.ArrayList;

public interface FriendAction {

    public String searchFriend(String name, String surname);

    public void addFriend(User currentuser, User Adduser);

}
