package myspring.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import myspring.book.service.BookService;
import myspring.book.vo.BookVO;

@Controller
public class BookController {
	@Autowired
	BookService bookService;

	@RequestMapping(path = "/bookList.do")
	ModelAndView bookList() {
		List<BookVO> bookList = bookService.getAllBookList();
		return new ModelAndView("bookList","bookList",bookList);
	}
	
	@RequestMapping(path = "/getBook.do")
	ModelAndView getBook(@RequestParam int id) {
		BookVO bookInfo = bookService.getBookInfo(id);
		return new ModelAndView("bookInfo","bookInfo",bookInfo);
	}
}