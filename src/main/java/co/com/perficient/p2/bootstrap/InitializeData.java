package co.com.perficient.p2.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @author : Juank544
 * @date : 27/07/2022
 **/
@Component
public class InitializeData {

    @Autowired
    private DataSource dataSource;

    @EventListener(ApplicationReadyEvent.class)
    public void loadData(){
        ResourceDatabasePopulator resourceDatabasePopulator = new ResourceDatabasePopulator(false,false,"UTF-8",new ClassPathResource("data.sql"));
        resourceDatabasePopulator.execute(dataSource);
    }
}
