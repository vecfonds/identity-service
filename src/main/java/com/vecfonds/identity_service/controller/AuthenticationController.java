package com.vecfonds.identity_service.controller;

import com.vecfonds.identity_service.dto.request.AuthenticationRequest;
import com.vecfonds.identity_service.dto.response.ApiResponse;
import com.vecfonds.identity_service.dto.response.AuthenticaitonResponse;
import com.vecfonds.identity_service.service.AuthenticationService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthenticationController {
    AuthenticationService authenticationService;

    @PostMapping("log-in")
    ApiResponse<AuthenticaitonResponse> authenticate(@RequestBody AuthenticationRequest request) {
        return ApiResponse.<AuthenticaitonResponse>builder()
                .result(
                        AuthenticaitonResponse.builder()
                                .authenticated(authenticationService.authenticate(request))
                                .build()
                )
                .build();
    }
}
