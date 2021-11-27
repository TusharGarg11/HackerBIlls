package com.hackerearth.hackerills.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackerearth.hackerills.entity.HackerBill;

public interface BillRepository extends JpaRepository<HackerBill, Integer>{

}
