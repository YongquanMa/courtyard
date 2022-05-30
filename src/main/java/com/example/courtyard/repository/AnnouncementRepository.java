package com.example.courtyard.repository;

import com.example.courtyard.entity.Announcement;
import com.example.courtyard.service.serviceImpl.AnnouncementServiceImpl;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
//@Repository
public interface AnnouncementRepository {
    List<Announcement> listAll();
    List<Announcement> findAll();
    void save( Announcement announcement);
    void add(Announcement announcement);
    @Transactional(isolation = Isolation.SERIALIZABLE)
    void deleteAll();
    void delete(Announcement announcement);

    void delete ( Long id );


}