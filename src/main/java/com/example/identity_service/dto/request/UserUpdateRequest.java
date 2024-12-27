package com.example.identity_service.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserUpdateRequest {
    @Size(min = 4, message = "INVALID_PASSWORD")
    String password;

    @NotEmpty(message = "EMPTY_FIRSTNAME")
    String firstname;

    @NotEmpty(message = "EMPTY_LASTNAME")
    String lastname;

    LocalDate dob;
}
