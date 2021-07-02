package com.example.haulmonttesttask.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "schedulenode")
public class PaymentScheduleNode extends AbstractIdEntity{

    @Column(name = "date", nullable = false)
    @NotNull
    private LocalDate date;

    @Column(name = "body", nullable = false)
    @NotNull
    @Min(value = 0)
    private Double body;

    @Column(name = "percent", nullable = false)
    @NotNull
    @Min(value = 0)
    private Double percent;

}
