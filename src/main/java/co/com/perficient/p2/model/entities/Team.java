package co.com.perficient.p2.model.entities;

import co.com.perficient.p2.model.dto.TeamDto;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "teams")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@NoArgsConstructor
@Getter @Setter
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer championships;
    private String chief;

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "team")
    private Car car;

    public Team(Long id, TeamDto teamDto) {
        this.id = id;
        this.name = teamDto.getName();
        this.championships = teamDto.getChampionships();
        this.chief = teamDto.getChief();
        this.car = teamDto.getCar();
    }
}
