package co.com.perficient.p2.services;

import java.util.List;

/**
 * @author : Juank544
 * @date : 21/07/2022
 **/
public interface CrudService <Dto, ID>{
    Dto create(Dto t);
    List<Dto> findAll();
    Dto findById(ID id);
    Dto update(Dto dto, ID id);
    void delete(ID id);
}
