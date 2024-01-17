package com.example.demoSpringApp.dto;

import lombok.Builder;
import java.util.List;
import java.time.LocalDate;

@Builder
public record UserDto(
        String username,
        List<com.example.demoSpringApp.dto.RoleDto> roles,
        String firstName,
        String lastName,
        String emailAddress) {}
