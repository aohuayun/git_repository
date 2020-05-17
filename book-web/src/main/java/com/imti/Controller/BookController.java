package com.imti.Controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.imti.pojo.Book;
import com.imti.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: ahy
 * @Date:2020/5/12
 * @Description:com.imti.Controller
 * @Version:1.0
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/books/findByName")
    @ResponseBody
    public PageInfo<Book> findBookByName(String name,@RequestParam(name="page",defaultValue = "1") Integer page){
        PageHelper.startPage(page,1);
        List<Book> books = bookService.findBooksByName(name);
        PageInfo<Book> pageInfo = new PageInfo<Book>(books);
        return pageInfo;
    }

}
