package com.company.dao;

import com.company.model.Book;

import java.util.List;

public interface BookDao {

    List<Book> findAll();
}
