package com.project.todo.repository;

import com.project.todo.entity.mysql.Priorities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrioritiesRepo extends JpaRepository<Priorities,Long> {
}
