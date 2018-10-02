package org.launchcode.my401k.models.forms;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;


@Entity
public class UserChoices {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private Map<String, Integer> userChoices = new HashMap<>();


    public UserChoices (Map userChoices) {

        this.userChoices = userChoices;

    }


    public UserChoices() { }


    public UserChoices createUserChoices(UserChoices userChoices) {

        UserChoices newUserChoices = new UserChoices();

        return (userChoices);

    }


    public int id() {
        return id;
    }


    public Map getUserChoices() {
        return userChoices;
    }

    public void setUserChoices(Map<String, Integer> userChoices) {
        this.userChoices = userChoices;
    }

}