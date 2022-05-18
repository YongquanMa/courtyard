package com.example.courtyard.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
@JsonDeserialize(builder = User.Builder.class)
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @JsonProperty
    private String username;

    @JsonProperty
    private String password;

    @JsonProperty("user_role")
    private UserRole userRole;

    @JsonProperty
    private String email;

    @JsonProperty
    private String building;

    @JsonProperty
    private String room;

    public User() {}

    private User(Builder builder) {
        this.userRole = builder.userRole;
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;
        this.building = builder.building;
        this.room = builder.room;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public static class Builder{

        @JsonProperty("user_role")
        private UserRole userRole;

        @JsonProperty
        private String username;

        @JsonProperty
        private String password;

        @JsonProperty
        private String email;

        @JsonProperty
        private String building;

        @JsonProperty
        private String room;

        public void setUserRole(UserRole userRole) {
            this.userRole = userRole;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setBuilding(String building) {
            this.building = building;
        }

        public void setRoom(String room) {
            this.room = room;
        }

        public User build() {
            return new User(this);
        }
    }
}
