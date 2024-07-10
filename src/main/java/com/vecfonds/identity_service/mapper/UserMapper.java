package com.vecfonds.identity_service.mapper;

import com.vecfonds.identity_service.dto.request.UserCreationRequest;
import com.vecfonds.identity_service.dto.request.UserUpdateRequest;
import com.vecfonds.identity_service.dto.response.UserResponse;
import com.vecfonds.identity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
