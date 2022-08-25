package co.com.perficient.p2.model.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "drivers")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "number")
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class Driver {

    @Id
    private Short number;
    private String name;
    private LocalDate birth;
    private String country;
    private Integer championships;

    @ManyToOne
    private Car car;
}
