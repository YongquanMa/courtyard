package com.example.courtyard.controller;

import com.example.courtyard.entity.Announcement;
import com.example.courtyard.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnnouncementController {
    private AnnouncementService announcementService;

    @Autowired
    public AnnouncementController(AnnouncementService announcementService){
        this.announcementService = announcementService;
    }

    @GetMapping(value = "/announcements")
    public List<Announcement> listAll(){
        return announcementService.listAll();
    }

    @PostMapping( "/announcements")
    public void add(@RequestBody Announcement announcement){
        announcementService.add(announcement);
    }
    @DeleteMapping("/announcements")
    public void deleteAll(){
        announcementService.deleteAll();
    }
}

