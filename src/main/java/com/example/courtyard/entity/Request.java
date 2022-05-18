package com.example.courtyard.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "request")
@JsonDeserialize(builder = User.Builder.class)
public class Request implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty
    private String date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @JsonProperty("event_type")
    private EventType eventType;

    @JsonProperty
    private String room;

    @JsonProperty
    private String description;

    @JsonProperty("is_approved")
    private boolean isApproved;

    public Request() {}

    private Request(Builder builder) {
        this.id = builder.id;
        this.date = builder.date;
        this.user = builder.user;
        this.room = builder.room;
        this.eventType = builder.eventType;
        this.description = builder.description;
        this.isApproved = builder.isApproved;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }

    public static class Builder{

        @JsonProperty
        private Long id;

        @JsonProperty
        private String date;

        @ManyToOne
        @JoinColumn(name = "user_id")
        private User user;

        @JsonProperty("event_type")
        private EventType eventType;

        @JsonProperty
        private String room;

        @JsonProperty
        private String description;

        @JsonProperty("is_approved")
        private boolean isApproved;

        public void setId(Long id) {
            this.id = id;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public void setEventType(EventType eventType) {
            this.eventType = eventType;
        }

        public void setRoom(String room) {
            this.room = room;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setApproved(boolean approved) {
            isApproved = approved;
        }

        public Request build() {
            return new Request(this);
        }
    }
}