package co.com.perficient.p2.dto;

import co.com.perficient.p2.model.Driver;
import co.com.perficient.p2.model.Team;

import java.io.Serializable;
import java.util.Set;

/**
 * @author : Juank544
 * @date : 22/07/2022
 **/
public class CarDto implements Serializable {

    private String name;
    private String powerUnit;
    private Team team;
    private Set<Driver> drivers;

    public CarDto() {
    }

    public CarDto(String name, String powerUnit, Team team, Set<Driver> drivers) {
        this.name = name;
        this.powerUnit = powerUnit;
        this.team = team;
        this.drivers = drivers;
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
