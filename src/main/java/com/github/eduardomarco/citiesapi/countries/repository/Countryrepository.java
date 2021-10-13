package com.github.eduardomarco.citiesapi.countries.repository;

import com.github.eduardomarco.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Countryrepository extends
        JpaRepository<Country, Long>
{

}
