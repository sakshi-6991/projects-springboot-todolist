package com.project.todo.repository;

import com.project.todo.entity.mysql.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepo extends JpaRepository<Status,Long> {

}
