package com.IteratorTask;

import com.UserAccount.User;

import java.util.ArrayList;

public class UserList<User> implements Collection {

    ArrayList<User> userArrayList;

    public UserList(ArrayList<User> userArrayList) {
        this.userArrayList = userArrayList;
    }

    public UserList() {
        this.userArrayList = new ArrayList<>();
    }

    public ArrayList<User> getUserArrayList() {
        return userArrayList;
    }

    public void setUserArrayList(ArrayList<User> userArrayList) {
        this.userArrayList = userArrayList;
    }

    @Override
    public Iterator getIterator() {
        return new UserIterator();
    }

    private class UserIterator implements Iterator{

        int index=0;

        @Override
        public boolean HasNext() {
            if(index<userArrayList.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object Next() {
            try {
                return userArrayList.get(index++);
            }catch (Exception e){
                return "No more objects";
            }

        }
    }


}
