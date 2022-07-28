package co.com.perficient.p2.model;

import co.com.perficient.p2.dto.TeamDto;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name = "teams")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer championships;
    private String chief;

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "team")
    private Car car;

    public Team() {
    }

    public Team(Long id, TeamDto teamDto) {
        this.id = id;
        this.name = teamDto.getName();
        this.championships = teamDto.getChampionships();
        this.chief = teamDto.getChief();
        this.car = teamDto.getCar();
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

    public Integer getChampionships() {
        return championships;
    }

    public void setChampionships(Integer championships) {
        this.championships = championships;
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
