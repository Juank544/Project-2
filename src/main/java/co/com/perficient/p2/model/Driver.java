package co.com.perficient.p2.model;

import co.com.perficient.p2.dto.DriverDto;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "drivers")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "number")
public class Driver {
    //numero as id
    @Id
    private Short number;
    private String name;
    private LocalDate birth;
    private String country;
    private Integer championships;

    @ManyToOne
    private Car car;

    public Driver() {
    }

    public Driver(Short number, DriverDto driverDto) {
        this.number = number;
        this.name = driverDto.getName();
        this.birth = driverDto.getBirth();
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
