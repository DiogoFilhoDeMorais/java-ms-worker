package com.microservice.msworker.controllers;

import java.util.List;

import com.microservice.msworker.Repository.WorkerRepo;
import com.microservice.msworker.model.Worker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/workers")
public class WorkerController {

    @Autowired
    private WorkerRepo repository;

    @GetMapping
    public ResponseEntity<List<Worker>> getAllWorkers() {        
        List<Worker> list = this.repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) throws Exception {
        Worker worker = repository.findById(id).get();
        return ResponseEntity.ok(worker);
    }

    @GetMapping(path = "/{id}/{dailyIncome}")
    public ResponseEntity<?> setDailyIncome(@PathVariable Integer id, @PathVariable Float dailyIncome) {
        return ResponseEntity.ok("Creating new Daily Income - ID: " + id + " - Daily Income: " + dailyIncome);
    }

    /* @PostMapping(path = "/id", params = ["name"]) */
    
}
