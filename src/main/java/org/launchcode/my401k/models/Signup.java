package org.launchcode.my401k.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Signup {

    @Id
    @Column(name="id")
    @GeneratedValue
    private Integer id;

    @Column
    @NotNull
    @Size(min=3, max=30, message = "Username must be at least 3 characters long and not more than 30")
    private String username;

    @Column
    @NotNull
    @Size(min=3, max=20, message = "Password must be at least 3 characters long and not more than 20")
    private String password;

    @NotNull
    @Size(min=3, max=20, message = "This must match your password")
    private String verify_password;


    public Signup(String username, int id, String password, String verify_password) {
        this.username = username;
        this.password = password;
    }

    public Signup() { }

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

    public String getVerify_password() {
        return verify_password;
    }

    public void setVerify_password(String verify_password) {
        this.verify_password = verify_password;
    }

}