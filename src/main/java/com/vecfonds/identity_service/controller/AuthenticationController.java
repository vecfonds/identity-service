package com.vecfonds.identity_service.controller;

import com.nimbusds.jose.JOSEException;
import com.vecfonds.identity_service.dto.request.AuthenticationRequest;
import com.vecfonds.identity_service.dto.request.IntrospectRequest;
import com.vecfonds.identity_service.dto.response.ApiResponse;
import com.vecfonds.identity_service.dto.response.AuthenticaitonResponse;
import com.vecfonds.identity_service.dto.response.IntrospectResponse;
import com.vecfonds.identity_service.service.AuthenticationService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthenticationController {
    AuthenticationService authenticationService;

    @PostMapping("log-in")
    ApiResponse<AuthenticaitonResponse> authenticate(@RequestBody AuthenticationRequest request) {
        return ApiResponse.<AuthenticaitonResponse>builder()
                .result(authenticationService.authenticate(request))
                .build();
    }

    @PostMapping("introspect")
    ApiResponse<IntrospectResponse> authenticate(@RequestBody IntrospectRequest request) throws ParseException, JOSEException {
        return ApiResponse.<IntrospectResponse>builder()
                .result(authenticationService.introspect(request))
                .build();
    }
}
