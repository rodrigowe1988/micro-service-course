package com.devsuperior.hr.worker.repositories;

import com.devsuperior.hr.worker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
