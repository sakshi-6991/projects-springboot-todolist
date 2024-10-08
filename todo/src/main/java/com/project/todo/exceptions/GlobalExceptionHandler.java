package com.project.todo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import com.project.todo.constant.AppConstants;

@ControllerAdvice
public class GlobalExceptionHandler {
    // Handle specific exceptions
    @ExceptionHandler(Throwable.class)
    public ResponseEntity<Object> handleResourceNotFoundException(Exception ex, WebRequest request){
        ex.printStackTrace();
        Map<String,Object> errorMsgMap = new HashMap<>();
        Map<String,Object> errorSubMsgDetailMap = new HashMap<>();
        if(ex instanceof  TaskNotFoundException){
            TaskNotFoundException te = (TaskNotFoundException) ex ;
            System.out.println("Task Not Found Exception for ID => " + te.getTaskId());
            errorSubMsgDetailMap.put(AppConstants.ERROR_CODE,te.getErrorCode());
            errorSubMsgDetailMap.put(AppConstants.ERROR_MSG,((TaskNotFoundException)ex).getMessage());
        }
        errorMsgMap.put(AppConstants.STATUS_CD,HttpStatus.NOT_FOUND.value());
        errorMsgMap.put(AppConstants.ERROR,errorSubMsgDetailMap);
        return new ResponseEntity<>(errorMsgMap, HttpStatus.NOT_FOUND);
    }
}
