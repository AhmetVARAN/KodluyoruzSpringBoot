package com.ahmetvaran.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class TeacherDto {

    private Long teacherId;

    @NotEmpty(message = "ad soyad alanını doldurunuz")
    @Size(min = 1,max = 255)
    private String teacherNameSurname;

    @NotEmpty(message = "email alanını doldurunuz")
    @Email(message = "uygun bir email adresini girin")
    private String teacherEmail;

    @NotEmpty(message = "password alanını doldurunuz")
    //@Min(value = 5, message = "minimum 5 karakter")
    //@Max(value = 18, message = "maximum 18 karakter")
    @Size(min=5,max=18)
    private String teacherPassword;
}
