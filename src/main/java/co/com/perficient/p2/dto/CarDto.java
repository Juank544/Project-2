package co.com.perficient.p2.dto;

import co.com.perficient.p2.entities.Driver;
import co.com.perficient.p2.entities.Team;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @author : Juank544
 * @date : 22/07/2022
 **/
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class CarDto implements Serializable {

    private String name;
    private String powerUnit;
    private Team team;
    private List<Driver> drivers;

}
