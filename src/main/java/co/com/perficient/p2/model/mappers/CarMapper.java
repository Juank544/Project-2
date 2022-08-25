package co.com.perficient.p2.model.mappers;

import co.com.perficient.p2.model.dto.CarDto;
import co.com.perficient.p2.model.entities.Car;
import org.mapstruct.Mapper;

/**
 * @author : Juank544
 * @date : 24/08/2022
 **/
@Mapper
public interface CarMapper {
    Car mapCar(CarDto carDto);
    CarDto mapCar(Car car);
}
