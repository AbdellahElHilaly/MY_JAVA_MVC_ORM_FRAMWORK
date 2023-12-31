package org.example.framwork.dao.guide;

import java.util.List;

public interface CrudService<T> {

    T save(T t) ;

    T select(int id);

    List<T> selectAll() ;

    T update(T t, int id) ;

    void delete(int id) ;

}
