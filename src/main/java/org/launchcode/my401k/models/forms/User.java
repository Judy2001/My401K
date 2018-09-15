package org.launchcode.my401k.models.forms;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int userId;

    @NotNull
    private String username;

    @NotNull
    private String password;


    public User(int userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }


    public User() { }



    public void setUser(User newUser) {
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

}
