package co.com.perficient.p2.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "drivers")
public class Driver {
    //numero as id
    @Id
    private Short number;
    private String name;
    private Date birth;
    private String country;
    private Integer championships;
    //private Car car;
}
