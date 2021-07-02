package com.example.haulmonttesttask.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "credit")
public class Credit extends AbstractIdEntity{

    @Column(name = "minlimit", nullable = false)
    @NotNull
    @Min(value = 0)
    private Double minLimit;

    @Column(name = "maxlimit", nullable = false)
    @NotNull
    @Min(value = 0)
    private Double maxLimit;

    @Column(name = "percent", nullable = false)
    @NotNull
    private Double percent;

}
