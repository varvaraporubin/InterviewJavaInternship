package Exercise2.userData;

public class UserName {
    String userName;

    public UserName() {
    }

    @Override
    public String toString() {
        return "UserName{" +
                "userName='" + userName + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserName(String userName) {
        this.userName = userName;
    }
}
