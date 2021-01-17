import com.UserAccount.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ChatServiceTest {



    User user1=new User("Евгений","Иванов",21);
    User user2=new User("Михаил","Резников",33);

    ChatService chatService=new ChatService() {
        @Override
        public void sendMessage(User sender,User recipient,String message) {
            sender.getInbox().add(message);
            recipient.getInbox().add(message);
        }

        @Override
        public void blockUser() {

            //need realization

        }

        @Override
        public void cleanChatHistory(User user) {
            user.getInbox().clear();
        }
    };

    @Test
    void TestsendMessage() {

        chatService.sendMessage(user1,user2,"Hello!");
        chatService.sendMessage(user1,user2,"Hi!");

        Assert.assertEquals(user1.getInbox(),user2.getInbox());


    }


    @Test
    void TestcleanChatHistory() {

        ArrayList<String> arrayList=new ArrayList<>();// empty array


        TestsendMessage();
        chatService.cleanChatHistory(user1);
        Assert.assertEquals(user1.getInbox(),arrayList);
        Assert.assertNotEquals(user1.getInbox(),user2.getInbox());
    }
}