package uteis;

public class User extends Person {
    private String phone;
    private String login;
    private int password;

    public User(String phone, String login, int password, String name, String email) {
        super(name, email);
        this.phone = phone;
        this.login = login;
        this.password = password;
    }

    public void User(String phone, String login, int password, String name, String email) {
    }

    public String getPhone() {
        return phone;
    }

    public String getLogin() {
        return login;
    }

    public int getPassword() {
        return password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [phone=" + phone + ", login=" + login + ", password=" + password + "]";
    }
}
