package com.example.Managing.Employees.Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeesDto {

    private long ids;
    private String firstName;
    private String lastName;
    private String email;

}
