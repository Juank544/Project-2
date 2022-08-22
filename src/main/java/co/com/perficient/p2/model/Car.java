package co.com.perficient.p2.model;

import co.com.perficient.p2.dto.CarDto;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cars")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@NoArgsConstructor
@Getter @Setter
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String powerUnit;

    @OneToOne(fetch = FetchType.EAGER)
    private Team team;

    @OneToMany(mappedBy = "car")
    private List<Driver> drivers;

    public Car(Long id, CarDto carDto) {
        this.id = id;
        this.name = carDto.getName();
        this.powerUnit = carDto.getPowerUnit();
        this.team = carDto.getTeam();
        this.drivers = carDto.getDrivers();
    }
}
