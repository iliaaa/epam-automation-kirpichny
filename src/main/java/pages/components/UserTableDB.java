package pages.components;

import java.util.ArrayList;
import java.util.List;

public class UserTableDB {

    private List<UserInfo> userInfo = new ArrayList<>();

    public void addUser(UserInfo user) {
        userInfo.add(user);
    }
}
