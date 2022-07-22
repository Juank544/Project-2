package co.com.perficient.p2.dto;

import co.com.perficient.p2.model.Car;

import java.io.Serializable;

/**
 * @author : Juank544
 * @date : 22/07/2022
 **/
public class DriverDto implements Serializable {

    private String country;
    private Integer championships;
    private Car car;

    public DriverDto() {
    }

    public DriverDto(String country, Integer championships, Car car) {
        this.country = country;
        this.championships = championships;
        this.car = car;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getChampionships() {
        return championships;
    }

    public void setChampionships(Integer championships) {
        this.championships = championships;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
