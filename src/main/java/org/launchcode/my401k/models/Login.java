package org.launchcode.my401k.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Login {

    @Id
    private Integer id;

    @NotNull
    @Size(min=3, max=30, message = "Username must be at least 3 characters long and not more than 30")
    private String username;

    @NotNull
    @Size(min=3, max=20, message = "Password must be at least 3 characters long and not more than 20")
    private String password;


    public Login(String username, int id, String password) {
        this.username = username;
        this.password = password;
    }

    public Login() { }

    public Integer getId() {
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