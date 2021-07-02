package pages.components;

public class UserInfo {

    private int number;
    private String user;
    private String description;

    public UserInfo(int number, String user, String description) {
        this.number = number;
        this.user = user;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public String getUser() {
        return user;
    }

    public String getDescription() {
        return description;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
