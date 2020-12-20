package com.bai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bai.entity.BaiSuper;

@Repository
public interface BaiRepository extends JpaRepository<BaiSuper, Long>{

}
