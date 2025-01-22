package com.example.identity_service.dto.request;

import com.example.identity_service.validator.DobConstraint;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    @Size(min = 3, message = "INVALID_USERNAME")
    String username;

    @Size(min = 4, message = "INVALID_PASSWORD")
    String password;

    @NotNull(message = "EMPTY_FIRSTNAME")
    String firstname;

    @NotNull(message = "EMPTY_LASTNAME")
    String lastname;

    @DobConstraint(min = 18, message = "INVALID_DOB")
    LocalDate dob;
}
