package org.launchcode.my401k.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;


@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @OneToMany
    @JoinColumn(name = "userChoices_id")
    private Map<String, Integer> userChoices = new HashMap<>();


    public User(int userId, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }


    public User() { }


    public void setUser(User newUser) {
    }


    public int getUserId() {
        return id;
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