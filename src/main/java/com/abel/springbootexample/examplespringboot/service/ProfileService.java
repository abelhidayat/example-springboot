package com.abel.springbootexample.examplespringboot.service;

import com.abel.springbootexample.examplespringboot.entity.Profile;
import com.abel.springbootexample.examplespringboot.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    public Page<Profile> findPage(Pageable xPageable) {
        return profileRepository.findAll(xPageable);
    }

    public Optional<Profile> findOne(Integer xID) {
        return profileRepository.findById(xID);
    }

    public Profile findOneById(Integer xID) {
        return findOne(xID).get();
    }

    public Profile create(Profile xPerson) {
        return profileRepository.save(xPerson);
    }

    public Profile update(Integer id, Profile profile){
        profile.setId(id);
        return profileRepository.save(profile);
    }

    public Profile delete(Integer id){
        Profile profile = findOneById(id);
        profileRepository.delete(profile);
        return profile;
    }
}
