package com.cssl.mapper;

import com.cssl.pojo.BookManager;

import java.util.List;

public interface BookManagerMapper {


    public List<BookManager> showAllBook();

    public Integer deleteBook(Integer id);

    public Integer insertBook(BookManager bookManager);

    public BookManager findById(Integer id);

    public Integer updateBook(BookManager bookManager);
}
