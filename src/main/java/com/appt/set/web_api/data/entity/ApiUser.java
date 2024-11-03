package com.appt.set.web_api.data.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="apiuser")
public class ApiUser {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long userId;
    @Column(nullable=false)
    private String name;
    @Column(unique=true, nullable= false)
    private String keyValue;
    @Column(nullable=false)
    private boolean active;
    @Column(nullable=false, updatable=false)
    private LocalDate dateCreate= LocalDate.now();


}
