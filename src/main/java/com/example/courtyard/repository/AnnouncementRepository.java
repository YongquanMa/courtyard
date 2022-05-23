package com.example.courtyard.repository;

import com.example.courtyard.entity.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {
    //findById is defined by JPARepository
    //Create others
    //findAll()
    //

}