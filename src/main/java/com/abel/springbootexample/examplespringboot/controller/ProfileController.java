package com.abel.springbootexample.examplespringboot.controller;

import com.abel.springbootexample.examplespringboot.dto.SuccessResponse;
import com.abel.springbootexample.examplespringboot.entity.Profile;
import com.abel.springbootexample.examplespringboot.service.ProfileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "api/profile")
public class ProfileController {
    @Autowired
    private ProfileService profileService;

    @GetMapping
    ResponseEntity<SuccessResponse> findPage(Pageable pageable) {
        Object data = profileService.findPage(pageable);
        String message = "Profile found";
        return ResponseEntity.ok(SuccessResponse.body(message, data));
    }

    @GetMapping(value = "{id}")
    ResponseEntity<SuccessResponse> findOneById(@PathVariable("id") Integer id) {

        Object data = profileService.findOneById(id);
        String message = "Profile found by id";
        return ResponseEntity.ok(SuccessResponse.body(message, data));
    }

    @PostMapping
    ResponseEntity<SuccessResponse> create(@RequestBody @Validated Profile profile) {

        Object data = profileService.create(profile);
        String message = "success create profile";
        return ResponseEntity.ok(SuccessResponse.body(message, data));
    }

    @PutMapping(value = "{id}")
    ResponseEntity<SuccessResponse> update(@PathVariable("id") Integer id, @RequestBody Profile profile){
        Object data = profileService.update(id, profile);
        String message = "success update profile";
        return ResponseEntity.ok(SuccessResponse.body(message, data));
    }

    @DeleteMapping(value = "{id}")
    ResponseEntity<SuccessResponse> delete(@PathVariable("id") Integer id){
        Object data = profileService.delete(id);
        String message = "success delete profile";
        return ResponseEntity.ok(SuccessResponse.body(message, data));
    }

}
