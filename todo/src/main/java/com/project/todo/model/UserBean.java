package com.project.todo.model;

import lombok.Data;
import javax.validation.constraints.NotBlank;

@Data
public class UserBean {
    @NotBlank(message = "First Name is required")
    private String firstName;
    @NotBlank(message = "Last Name is required")
    private String lastName;
    @NotBlank(message = "Email is required")
    private String email;
    @NotBlank(message = "Password is required")
    private String password;
    @NotBlank(message = "Mobile is required")
    private String mobile;
}
