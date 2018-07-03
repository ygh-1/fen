package cn.bdqn.fen.service;

import cn.bdqn.fen.dao.BookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Server("bookService")
public class BookServiceImpl implements  BookService {

    @Resource
    private BookMapper bookMapper;

    @Override
    public List<BooksEntity> all() {
        return bookMapper.all();
    }
}
