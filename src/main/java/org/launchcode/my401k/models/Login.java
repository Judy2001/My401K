package org.launchcode.my401k.models;



import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Login extends User {

    @NotNull
    @Size(min=3, max=30, message = "Username not in database")
    private String username;

    @NotNull
    @Size(min=3, max=20, message = "Password incorrect")
    private String password;


    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public Login() { }


    public User loginUser(){
        User user = new User();
        user.setUsername(this.username);
        user.setPassword(this.password);

        return (user);
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}