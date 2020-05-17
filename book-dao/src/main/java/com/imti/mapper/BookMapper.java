package com.imti.mapper;

import com.imti.pojo.Book;

import java.util.List;

/**
 * @Author: ahy
 * @Date:2020/5/12
 * @Description:com.imti.mapper
 * @Version:1.0
 */
public interface BookMapper {
    public List<Book> findBooksByName(String name);
}
