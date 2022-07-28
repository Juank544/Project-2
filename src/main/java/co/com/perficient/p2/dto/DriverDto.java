package co.com.perficient.p2.dto;

import co.com.perficient.p2.model.Car;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author : Juank544
 * @date : 22/07/2022
 **/
public class DriverDto implements Serializable {

    private String name;
    private LocalDate birth;
    private String country;
    private Integer championships;
    private Car car;

    public DriverDto() {
    }

    public DriverDto(String name, LocalDate birth, String country, Integer championships, Car car) {
        this.name = name;
        this.birth = birth;
        this.country = country;
        this.championships = championships;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
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
