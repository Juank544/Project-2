package co.com.perficient.p2.services.impl;

import co.com.perficient.p2.model.entities.Driver;
import co.com.perficient.p2.model.mappers.DriverMapper;
import co.com.perficient.p2.repository.DriverRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.time.LocalDate;
import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyShort;
import static org.mockito.Mockito.when;

@SpringBootTest
class DriverServiceImplTest {

    @MockBean
    private DriverRepository driverRepository;

    @Autowired
    private DriverServiceImpl driverService;

    @Autowired
    private DriverMapper mapper;

    @Test
    void findByIdNotSuccess(){
        when(driverRepository.findById(anyShort())).thenReturn(Optional.empty());
        assertThrows(NoSuchElementException.class, () ->
                driverService.findById((short) 44));
    }

    @Test
    //TODO revisar el equals
    void findByIdSuccess() {
        var driver = new Driver((short) 44,"Lewis Hamilton", LocalDate.of(1985,1,6),"United Kingdom",7,null);

        when(driverRepository.findById(anyShort())).thenReturn(Optional.of(driver));

        var driverFound = assertDoesNotThrow(() ->
                driverService.findById((short) 44));
        assertEquals(mapper.mapDriver(driver),driverFound);
    }
}