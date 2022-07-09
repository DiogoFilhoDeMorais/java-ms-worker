package com.microservice.msworker.Repository;

import com.microservice.msworker.model.Worker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepo extends JpaRepository<Worker, Long> {
    
}
