package com.imti.service;

import com.imti.pojo.Book;

import java.util.List;

/**
 * @Author: ahy
 * @Date:2020/5/12
 * @Description:com.imti.service
 * @Version:1.0
 */
public interface BookService {
    public List<Book> findBooksByName(String name);
}
