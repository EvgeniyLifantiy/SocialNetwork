package com.ProfileService;



import com.UserAccount.User;

import java.util.ArrayList;

public class ProfileService implements ShowProfile{

    ArrayList<User> userArrayList;


    public ProfileService(ArrayList userArrayList){
        this.userArrayList=userArrayList;
    }

    @Override
     public String showUserProfile(User friend) throws NonExistentUserException {
        if(userArrayList.contains(friend)){
            return (friend.getProfile());
        }else {
            throw new NonExistentUserException("Такой пользователь не найден");
        }

    }


}
