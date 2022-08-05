package co.com.perficient.p2.repository;

import co.com.perficient.p2.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Short> {

    @Query(value = "SELECT * " +
            "FROM drivers d " +
            "WHERE lower(d.name) = :name", nativeQuery = true)
    Driver findDriverByName(String name);
    List<Driver> findByBirthBetween(LocalDate dateFrom, LocalDate dateUntil);
}
