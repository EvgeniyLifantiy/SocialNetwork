package com.ProfileService;


import com.FriendService.User;

public class ProfileService implements ShowProfile{


    @Override
     public String showUserProfile(User friend) {
        return (friend.getProfile());
    }


}
