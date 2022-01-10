package com.bharath.dating.repository;

import com.bharath.dating.model.Interest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterestRepository extends JpaRepository<Interest, Integer> {
}
