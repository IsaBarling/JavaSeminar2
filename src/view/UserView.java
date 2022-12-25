package view;

import data.User;

import java.util.List;

public abstract class UserView {

    private void showTheBest(List<User> userList) {
        User user = findTheBest(userList);

        System.out.println(user.getName());
    }

    protected abstract User findTheBest(List<User> userList);

}
