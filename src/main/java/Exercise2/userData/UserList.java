package Exercise2.userData;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public UserList() {
        this.users = users;
    }

    public void insertNewUser (User user){
        int size = this.users.size();
        List<User> updateUser = new ArrayList<>(size +1);
        updateUser.add(user);
        for (int i =0; i< size; i++){
         //   updateUser.get(i)=users.get(i);
        }
      //  updateUser.get(size)=user;

        this.users = updateUser;
    }


}
