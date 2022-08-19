package co.com.perficient.p2.dto;

import co.com.perficient.p2.model.Car;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author : Juank544
 * @date : 22/07/2022
 **/
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class TeamDto implements Serializable {

    private String name;
    private Integer championships;
    private String chief;
    private Car car;

}
