package com.example.courtyard.service;

import com.example.courtyard.entity.Announcement;
import com.example.courtyard.exception.AnnouncementNotExistException;
import com.example.courtyard.repository.AnnouncementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class AnnouncementService {
    private AnnouncementRepository announcementRepository;

    @Autowired
    public AnnouncementService(AnnouncementRepository announcementRepository){
        this.announcementRepository = announcementRepository;
    }

    public List<Announcement> listAll(){
        return announcementRepository.findAll();
    }
    public void add(Announcement announcement){
        announcementRepository.save(announcement);
    }
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void deleteAll() {
        announcementRepository.deleteAll();
    }

}
