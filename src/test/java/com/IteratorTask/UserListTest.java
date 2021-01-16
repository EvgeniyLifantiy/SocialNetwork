package com.IteratorTask;

import com.UserAccount.User;
import org.junit.Assert;
import org.testng.annotations.Test;

public class UserListTest {

    UserList<User> userList=new UserList<>();

    User user1=new User("Иван","",23);
    User user2=new User("Артур","Алехин",34);
    User user3=new User("Михаил","Минеев",45);
    User user4=new User("Сергей","Гуров",21);
    User user5=new User("Павел","Кряной",18);

    Iterator iterator= userList.getIterator();

    @Test
    public void TestNext(){

        Assert.assertEquals(user1,iterator.Next());
        Assert.assertEquals(user2,iterator.Next());
        Assert.assertEquals(user3,iterator.Next());
        Assert.assertEquals(user4,iterator.Next());
        Assert.assertEquals(user5,iterator.Next());


        Assert.assertEquals("No more objects",iterator.Next());





    }

}
