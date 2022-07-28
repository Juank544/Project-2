package co.com.perficient.p2.services;

import java.util.List;

/**
 * @author : Juank544
 * @date : 21/07/2022
 **/
public interface CrudService <T, Dto, ID>{
    T create(T t);
    List<T> findAll();
    T findById(ID id);
    T update(Dto dto, ID id);
    void delete(ID id);
}
