package com.fabbaraujo.hrworker.repositories;

import com.fabbaraujo.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
