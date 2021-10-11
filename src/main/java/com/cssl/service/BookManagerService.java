package com.cssl.service;

import com.cssl.pojo.BookManager;

import java.util.List;

public interface BookManagerService {
    public List<BookManager> showAll();
    public int deleteBookManager(Integer id);
    public int updateBookManager(BookManager bookManager);
    public BookManager findById(Integer id);
    public int addBookManager(BookManager bookManager);
}
