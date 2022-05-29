package com.example.courtyard.service.serviceImpl;

import com.example.courtyard.entity.Announcement;
import com.example.courtyard.repository.AnnouncementRepository;
import com.example.courtyard.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {
    @Autowired
    private AnnouncementRepository announcementRepository;
    @Override
    public List<Announcement> listAll(){
        return announcementRepository.findAll();
    }
    @Override
    public void add(Announcement announcement){
        announcementRepository.save(announcement);
    }
    @Override
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void deleteAll() {
        announcementRepository.deleteAll();
    }
    @Override
    public void delete(Long id){
        announcementRepository.delete(id);
    }

}
