package com.example.courtyard.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "announcement")
public class Announcement {
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
}
