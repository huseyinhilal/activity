package com.activity.activity.repository;

import com.activity.activity.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ActivityRepository extends JpaRepository<Activity,Integer> {
    @Query("select u from Activity u where u.createdUserId = :createdUserId")
    Activity findByUserId(@Param("createdUserId") String createdUserId);
}
