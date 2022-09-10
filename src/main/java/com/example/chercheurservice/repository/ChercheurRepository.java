package com.example.chercheurservice.repository;


import com.example.chercheurservice.entities.Chercheur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ChercheurRepository  extends JpaRepository<Chercheur, Long> {
    Chercheur getChercheurById(Long chercheurID);
    Chercheur findByName(String name);
}
