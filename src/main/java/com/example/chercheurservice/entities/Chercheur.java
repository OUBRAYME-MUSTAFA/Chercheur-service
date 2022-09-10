package com.example.chercheurservice.entities;

import com.example.chercheurservice.enums.RoleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Chercheur {
    @javax.persistence.Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String Role;

    public Chercheur(String name) {
        this.name = name;
    }
}
