package com.github.eduardomarco.citiesapi.countries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Country {
    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "nome_pt")
    private String portuguesename;

    @Column(name = "sigla")
    private String code;

    private Integer bacen;

    public Country() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPortuguesename() {
        return portuguesename;
    }

    public String getCode() {
        return code;
    }

    public Integer getBacen() {
        return bacen;
    }
}
