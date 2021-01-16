package com.ProfileService;


import com.UserAccount.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ProfileServiceTest {

    @Test
    public void TestShowUserProfile() {



        User user1=new User("Евгений","Иванов",21);
        User user2=new User("Михаил","Резников",33);

        ArrayList<User> userArrayList=new ArrayList<>();
        ProfileService profileService=new ProfileService(userArrayList);

        userArrayList.add(user1);
        userArrayList.add(user2);





        Object o=new Object()  ;
        try {

            Assert.assertEquals("Евгений Иванов 21",profileService.showUserProfile(user1));
            Assert.assertEquals("Михаил Резников 33",profileService.showUserProfile(user2));


            Assert.assertEquals("Евгений Иванов 21",profileService.showUserProfile((User) o));// get exception

        }catch (NonExistentUserException e){
            e.getMessage();
        }

    }

}
