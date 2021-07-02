package com.example.haulmonttesttask.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "clients")
public class Client extends AbstractIdEntity{

    @Size(max = 200)
    @Column(name = "fio", nullable = false, length = 200)
    @NotNull
    @NotBlank
    private String fio;

    @Size(max = 20)
    @Column(name = "number", nullable = false, length = 20)
    @NotNull
    @NotBlank
    private String number;

    @Size(max = 200)
    @Column(name = "email", nullable = false, length = 200)
    @NotBlank
    private String email;


    @Column(name = "passportid", nullable = false)
    private Integer passportId;
}