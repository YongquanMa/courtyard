package com.example.courtyard.controller;

import com.example.courtyard.entity.Announcement;
import com.example.courtyard.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Dashboard")
public class AnnouncementController {
    @Autowired
    private AnnouncementService announcementService;

    @GetMapping(value = "/listAll")
    public List<Announcement> listAll(){
        return announcementService.listAll();
    }

    @PostMapping( "/add")
    public void add(@RequestBody Announcement announcement){
        announcementService.add(announcement);
    }
    @DeleteMapping("/deleteAll")
    public void deleteAll(){
        announcementService.deleteAll();
    }

    @DeleteMapping("/delete")
    public void delete(Long id){
        announcementService.delete(id);
    }
}

