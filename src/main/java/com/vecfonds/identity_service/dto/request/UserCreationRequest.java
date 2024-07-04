package com.vecfonds.identity_service.dto.request;

import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserCreationRequest {
    @Size(min = 5, message = "INVALID_USERNAME")
    private String username;
    @Size(min = 5, message = "INVALID_PASSWORDs")
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate dob;
}
