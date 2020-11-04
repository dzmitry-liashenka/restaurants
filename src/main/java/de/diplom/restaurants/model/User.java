package de.diplom.restaurants.model;

import java.util.Date;
import java.util.Set;

public class User {
    private Integer id;

    private String name;

    private String email;

    private String password;

    private Date registered;

    private boolean voted;

    private Set<Role> roles;

    public User(Integer id, String name, String email, String password, Date registered, boolean voted, Set<Role> roles) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.registered = registered;
        this.voted = voted;
        setRoles(roles);
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    public boolean isVoted() {
        return voted;
    }

    public void setVoted(boolean voted) {
        this.voted = voted;
    }

}

