package co.com.perficient.p2.repository;

import co.com.perficient.p2.model.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Short> {

    @Query("SELECT d FROM Driver d WHERE lower(d.name) LIKE concat('%', concat(lower(:name), '%'))")
    Driver findByName(@Param("name") String name);
    List<Driver> findByBirthBetween(LocalDate dateFrom, LocalDate dateUntil);
}
