import com.UserAccount.User;

public interface ChatService {

    public void sendMessage(User sender, User recipient, String message);

    public void blockUser();

    public void cleanChatHistory(User user);

}
