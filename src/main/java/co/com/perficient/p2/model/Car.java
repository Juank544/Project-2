package co.com.perficient.p2.model;

import co.com.perficient.p2.dto.CarDto;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "cars")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@carId")
public class Car {
    //filtrar los 3 primeros
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String powerUnit;

    @OneToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @OneToMany
    private Set<Driver> drivers = new HashSet<>();

    public Car() {
    }

    public Car(Long id, CarDto carDto) {
        this.id = id;
        this.name = carDto.getName();
        this.powerUnit = carDto.getPowerUnit();
        this.team = carDto.getTeam();
        this.drivers = carDto.getDrivers();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPowerUnit() {
        return powerUnit;
    }

    public void setPowerUnit(String powerUnit) {
        this.powerUnit = powerUnit;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }
}
