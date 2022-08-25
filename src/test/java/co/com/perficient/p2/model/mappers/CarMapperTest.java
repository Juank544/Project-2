package co.com.perficient.p2.model.mappers;

import co.com.perficient.p2.model.dto.CarDto;
import co.com.perficient.p2.model.entities.Car;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author : Juank544
 * @date : 24/08/2022
 **/
@SpringBootTest
class CarMapperTest {

    private final CarMapper mapper = Mappers.getMapper(CarMapper.class);

    @Test
    void mapCar() {
        Car car = new Car();

        car.setId(1L);
        car.setName("Royalton");
        car.setPowerUnit("Red Bull");

        var car2 = mapper.mapCar(car);
        assertEquals(car.getName(),car2.getName());
        assertEquals(car.getPowerUnit(),car2.getPowerUnit());
    }

    @Test
    void testMapCar() {
        CarDto carDto = new CarDto();

        carDto.setId(2L);
        carDto.setName("Red Bull");
        carDto.setPowerUnit("Royalton");

        var car2 = mapper.mapCar(carDto);
        assertEquals(carDto.getName(),car2.getName());
        assertEquals(carDto.getPowerUnit(),car2.getPowerUnit());
    }
}