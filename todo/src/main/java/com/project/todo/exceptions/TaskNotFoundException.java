package com.project.todo.exceptions;

public class TaskNotFoundException extends Exception{
    private int taskId;
    private String  errorCode;
    private String message;

    public TaskNotFoundException(int taskId, String message, String errorCode) {
        super(message);
        this.taskId = taskId;
        this.errorCode = errorCode;
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public String toString() {
        return "TaskNotFoundException{" +
                "taskId=" + taskId +
                ", errorCode='" + errorCode + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
