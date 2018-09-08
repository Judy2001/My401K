package org.launchcode.my401k.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Signup {

    @Id
    @GeneratedValue
    private int userId;

    @NotNull
    @Size(min=3, max=30, message = "Username must be 3-20 characters long")
    private String username;

    @NotNull
    @Size(min=3, max=20, message = "Password must be 3-20 characters long")
    private String password;

    @NotNull
    @Size(min=3, max=20, message = "Passwords must match")
    private String verify_password;


    public Signup(String username, int userId, String password, String verify_password) {
        this.username = username;
        this.password = password;
    }

    public Signup() { }


    public void setSignup(Signup signup) {
    }


    public int getUserId() {
        return userId;
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

    public String getVerify_password() {
        return verify_password;
    }

    public void setVerify_password(String verify_password) {
        this.verify_password = verify_password;
    }

}