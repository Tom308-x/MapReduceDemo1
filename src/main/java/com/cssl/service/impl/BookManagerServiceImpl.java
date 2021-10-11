package com.cssl.service.impl;

import com.cssl.mapper.BookManagerMapper;
import com.cssl.pojo.BookManager;
import com.cssl.service.BookManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookManagerServiceImpl implements BookManagerService {

    @Autowired
    private BookManagerMapper bookManagerMapper;

    @Override
    public List<BookManager> showAll() {
        return bookManagerMapper.showAllBook();
    }

    @Override
    public int deleteBookManager(Integer id) {
        return bookManagerMapper.deleteBook(id);
    }

    @Override
    public int updateBookManager(BookManager bookManager) {
        return bookManagerMapper.updateBook(bookManager);
    }

    @Override
    public BookManager findById(Integer id) {
        return bookManagerMapper.findById(id);
    }

    @Override
    public int addBookManager(BookManager bookManager) {
        return bookManagerMapper.insertBook(bookManager);
    }
}
