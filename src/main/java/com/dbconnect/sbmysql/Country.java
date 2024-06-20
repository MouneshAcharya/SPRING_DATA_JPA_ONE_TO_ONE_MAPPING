package com.dbconnect.sbmysql;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="Country")
@Data
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToOne(mappedBy = "country")
    private Capital capital;
}
