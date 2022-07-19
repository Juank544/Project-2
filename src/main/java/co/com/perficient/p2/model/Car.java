package co.com.perficient.p2.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "cars")
public class Car {
    //filtrar los 3 primeros
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String powerUnit;
    //private Team team;
    //private Set<Driver> drivers = new HashSet<>();
}
