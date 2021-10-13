package com.github.eduardomarco.citiesapi.states.repository;


import com.github.eduardomarco.citiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}