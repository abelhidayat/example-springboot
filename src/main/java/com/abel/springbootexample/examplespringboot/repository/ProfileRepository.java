package com.abel.springbootexample.examplespringboot.repository;

import com.abel.springbootexample.examplespringboot.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Integer>{
}
