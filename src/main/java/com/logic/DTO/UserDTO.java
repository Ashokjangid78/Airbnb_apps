package com.logic.DTO;


import com.logic.entity.enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDTO {

    private Long id;
    private String email;
    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;
}
