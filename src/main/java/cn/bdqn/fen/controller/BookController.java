package cn.bdqn.fen.controller;

import cn.bdqn.fen.service.BookService;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class BookController {
    @Resource(name="bookService")
    private BookService bookService;

    @RequestMapping("/index.html")
    public String toIndex(Model model) {
        List<BooksEntity> list=bookService.all();
        model.addAttribute("list",list);
        return "index";
    }



}
