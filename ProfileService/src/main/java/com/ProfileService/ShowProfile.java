package com.ProfileService;



import com.UserAccount.User;

public interface ShowProfile {

    public String showUserProfile(User friend) throws NonExistentUserException;



}
