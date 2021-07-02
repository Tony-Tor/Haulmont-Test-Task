package com.example.haulmonttesttask.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "banks")
public class Bank extends AbstractIdEntity{

    @OneToMany
    @NotNull
    private Set<Credit> credits;

    @OneToMany
    @NotNull
    private Set<Client> clients;
}
