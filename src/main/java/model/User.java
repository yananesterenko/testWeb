package model;

public class User {
    String firstName;
    String lastName;
    String login;
    String password;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public   String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
