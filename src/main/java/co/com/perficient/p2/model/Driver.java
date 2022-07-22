package co.com.perficient.p2.model;

import co.com.perficient.p2.dto.DriverDto;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "drivers")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@driverId")
public class Driver {
    //numero as id
    @Id
    private Short number;
    private String name;
    private Date birth;
    private String country;
    private Integer championships;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    public Driver() {
    }

    public Driver(Short number, String name, Date birth, DriverDto driverDto) {
        this.number = number;
        this.name = name;
        this.birth = birth;
        this.country = driverDto.getCountry();
        this.championships = driverDto.getChampionships();
        this.car = driverDto.getCar();
    }

    public Short getNumber() {
        return number;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
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
