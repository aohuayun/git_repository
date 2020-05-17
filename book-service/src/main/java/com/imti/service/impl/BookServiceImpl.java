package com.imti.service.impl;

import com.imti.mapper.BookMapper;
import com.imti.pojo.Book;
import com.imti.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ahy
 * @Date:2020/5/12
 * @Description:com.imti.service.impl
 * @Version:1.0
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    public List<Book> findBooksByName(String name) {
        return bookMapper.findBooksByName(name);
    }
}
