package com.FrindsService;

import com.FriendService.FriendService;
import com.UserAccount.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class FriendServiceTest {




    User user =new User("Artur","Blake",20);
    User user1 =new User("John","Naige",24);

    ArrayList<User> userArrayList=new ArrayList<>();

    @Test
    public void TestSearchFriend(){



        userArrayList.add(user);
        userArrayList.add(user1);

        FriendService friendService=new FriendService();



        Assert.assertEquals(user.getProfile(),friendService.searchFriend("Artur","Blake",userArrayList));
        Assert.assertEquals(user1.getProfile(),friendService.searchFriend("John","Naige",userArrayList));
        Assert.assertEquals("Пользователь не найден",friendService.searchFriend("John1","Naige",userArrayList));
    }


    @Test
    public void TestaddFriend(){



        ArrayList ArturFriendList=new ArrayList();
        ArturFriendList.add(user1);

        FriendService friendService=new FriendService();



        friendService.addFriend(user,user1);
        Assert.assertTrue(ArturFriendList.equals(user.getFriendlist()));

    }



}
