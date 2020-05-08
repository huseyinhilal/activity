package com.activity.activity.controller;

import com.activity.activity.model.Activity;
import com.activity.activity.model.Participation;
import com.activity.activity.repository.ActivityRepository;
import com.activity.activity.repository.ParticipationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/rest/participation")
public class ParticipationController {

        @Autowired
        ParticipationRepository participationRepository;

        @GetMapping(value = "/all")
        public List<Participation> getAll() {
            return participationRepository.findAll();
        }

        @PostMapping(value = "/load")
        public List<Participation> persist(@RequestBody final Participation participation) {
            participationRepository.save(participation);
            return participationRepository.findAll();
        }
}
