package co.com.perficient.p2.model;

import java.util.HashSet;
import java.util.Set;

public class Car {
    //filtrar los 3 primeros
    private Long id;
    private String name;
    private String powerUnit;
    private Team team;
    private Set<Driver> drivers = new HashSet<>();
}
