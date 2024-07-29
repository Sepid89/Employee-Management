package net.javaguideds.ems.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
}
