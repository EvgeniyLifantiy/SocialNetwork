package com.ProfileService;



import com.FriendService.User;
import org.junit.Assert;
import org.junit.Test;

public class ProfileServiceTest {

    @Test
    public void TestShowUserProfile(){
        User user=new User("Евгений","Иванов",21);
        ProfileService profileService=new ProfileService();
        Assert.assertEquals("Евгений Иванов 21",profileService.showUserProfile(user));
    }

}
