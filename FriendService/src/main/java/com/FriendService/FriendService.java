package com.FriendService;

import com.UserAccount.User;
import java.util.ArrayList;

public class FriendService implements FriendAction{

    ArrayList<User> Userlist;


    public FriendService(ArrayList userArrayList){
        this.Userlist=userArrayList;
    }


    @Override
    public String searchFriend(String name, String surname) {

        int index=0;

        while (index<Userlist.size()){
            if(name.equals(Userlist.get(index).getName())  &&  surname.equals(Userlist.get(index).getSurname())){
                return Userlist.get(index).getProfile();
            }
            index++;
        }
        return "Пользователь не найден";
    }

    @Override
    public void addFriend(User currentuser,User Adduser) {

        currentuser.addtoFriendList(Adduser);

    }
}
