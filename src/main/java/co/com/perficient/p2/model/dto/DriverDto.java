package co.com.perficient.p2.model.dto;

import co.com.perficient.p2.model.entities.Car;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author : Juank544
 * @date : 22/07/2022
 **/
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class DriverDto implements Serializable {

    private Short number;
    private String name;
    private LocalDate birth;
    private String country;
    private Integer championships;
    private Car car;

}
