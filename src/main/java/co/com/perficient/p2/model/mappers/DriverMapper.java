package co.com.perficient.p2.model.mappers;

import co.com.perficient.p2.model.dto.DriverDto;
import co.com.perficient.p2.model.entities.Driver;
import org.mapstruct.Mapper;

/**
 * @author : Juank544
 * @date : 23/08/2022
 **/
@Mapper
public interface DriverMapper {

    Driver mapDriver(DriverDto driverDto);
    DriverDto mapDriver(Driver driver);


}
