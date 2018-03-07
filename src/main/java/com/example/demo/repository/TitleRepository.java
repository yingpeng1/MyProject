package com.example.demo.repository;

import com.example.demo.entity.Title;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TitleRepository extends JpaRepository<Title,Integer> {

}
