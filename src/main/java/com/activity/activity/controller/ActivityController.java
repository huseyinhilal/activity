package com.activity.activity.controller;

import com.activity.activity.model.Activity;
import com.activity.activity.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/rest/activity")
public class ActivityController {
    @Autowired
    ActivityRepository activityRepository;

    @GetMapping(value = "/all")
    public List<Activity> getAll() {
        return activityRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<Activity> persist(@RequestBody final Activity activity) {
        activityRepository.save(activity);
        return activityRepository.findAll();
    }

    //id'ye göre etkinlik çekmek
    @PostMapping(value="/loadby")
    public Optional<Activity> getUserById(@RequestBody Integer userId){
        return activityRepository.findById(userId);
    }
}
