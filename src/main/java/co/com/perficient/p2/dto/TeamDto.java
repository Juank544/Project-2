package co.com.perficient.p2.dto;

import co.com.perficient.p2.model.Car;

import java.io.Serializable;

/**
 * @author : Juank544
 * @date : 22/07/2022
 **/
public class TeamDto implements Serializable {

    private String name;
    private String chief;
    private Car car;

    public TeamDto() {
    }

    public TeamDto(String name,String chief, Car car) {
        this.name = name;
        this.chief = chief;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
