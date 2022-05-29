package com.example.courtyard.service;

import com.example.courtyard.entity.Announcement;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

public interface AnnouncementService {

    List<Announcement> listAll();
    void add(Announcement announcement);
    @Transactional(isolation = Isolation.SERIALIZABLE)
    void deleteAll();
    void delete(Long id);

}
