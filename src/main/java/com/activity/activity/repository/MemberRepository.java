package com.activity.activity.repository;

import com.activity.activity.model.Members;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Members,Integer> {

}
