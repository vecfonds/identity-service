package com.vecfonds.identity_service.dto.request;

import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserCreationRequest {
    @Size(min = 5, message = "Username must be at least 5 characters!")
    private String username;
    @Size(min = 5, message = "Password must be at least 5 characters!")
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate dob;
}
