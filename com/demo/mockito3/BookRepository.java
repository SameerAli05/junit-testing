package com.demo.mockito3;
import java.util.Collection;

public interface BookRepository {
    void save(Book book);
    Collection<Book> findAll();


}
