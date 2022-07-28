package co.com.perficient.p2.dto;

import co.com.perficient.p2.model.Driver;
import co.com.perficient.p2.model.Team;

import java.io.Serializable;
import java.util.List;

/**
 * @author : Juank544
 * @date : 22/07/2022
 **/
public class CarDto implements Serializable {

    private String name;
    private String powerUnit;
    private Team team;
    private List<Driver> drivers;

    public CarDto() {
    }

    public CarDto(String name, String powerUnit, Team team, List<Driver> drivers) {
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

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public void addDriver(Driver driver){
        this.drivers.add(driver);
    }

    public void removeDriver(Driver driver){
        this.drivers.remove(driver);
    }
}
