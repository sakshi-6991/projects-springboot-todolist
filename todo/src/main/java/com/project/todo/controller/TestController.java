package com.project.todo.controller;

import com.project.todo.entity.mysql.Priorities;
import com.project.todo.entity.mysql.User;
import com.project.todo.exceptions.TaskNotFoundException;
import com.project.todo.repository.PrioritiesRepo;
import com.project.todo.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.stream.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {
    @Autowired
    private PrioritiesRepo prioritiesRepo;
    @Autowired
    private MailService mailService;
    @GetMapping("/status")
    public List<String> exceptionExample() throws TaskNotFoundException {
        int taskId = 1002;
//        String errorCode = "ERR_9092"; // Task Not Found Exception
//        throw new TaskNotFoundException(taskId, "Invalid Task ID ",errorCode);
        List<Priorities> prioritiesList = prioritiesRepo.findAll();
        List<String> priorityList = prioritiesList.stream().map(i->i.getPriorities()).collect(Collectors.toList());
        //priorities , priorityList
//        return ResponseHelper.successResponse();
        return priorityList;
    }
    @PostMapping("/email")
    public void sendMail(@RequestBody User user){
       // mailService.sendMail(user.getEmail(),"Registration Successfully", "Hi "+user.getName()+",\n\nThank you for registration with us!");
    }

}
