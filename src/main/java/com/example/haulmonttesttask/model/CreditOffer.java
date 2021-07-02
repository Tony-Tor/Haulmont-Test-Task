package com.example.haulmonttesttask.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "creditoffer")
public class CreditOffer extends AbstractIdEntity{

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    @NotNull
    private Client client;

    @ManyToOne
    @JoinColumn(name = "credit_id", nullable = false)
    @NotNull
    private Credit credit;

    @Column(name = "total", nullable = false)
    @NotNull
    private Double total;

    @OneToMany
    @NotNull
    private Set<PaymentScheduleNode> scheduleNodeList;

}
