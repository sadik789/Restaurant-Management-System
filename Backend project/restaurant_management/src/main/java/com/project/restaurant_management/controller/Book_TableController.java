package com.project.restaurant_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.restaurant_management.model.Book_Table;
import com.project.restaurant_management.service.Book_TableService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("book")
public class Book_TableController {
    
    @Autowired
    Book_TableService btservice;

    @GetMapping("getBookTable")	
    @ResponseBody
    public List<Book_Table> getAllBook_Table() {
        List<Book_Table> book_list=btservice.getBook_Table();
        return book_list;
        
    }

    @PostMapping("addBTable")
    @ResponseBody
     public void addBook_Table(@RequestBody  Book_Table book_Table) {
        // TODO Auto-generated method stub
    btservice.saveBook_Table(book_Table);
        
    }

    @PutMapping("updateBTable/{book_tid}")
    @ResponseBody
    public Book_Table updateByBook_TableId( @PathVariable("book_tid") int  book_tid,@RequestBody Book_Table book_Table) {
        Book_Table bTable=btservice.updateBook_Table(book_tid, book_Table);
      
     return bTable;
 }

 @DeleteMapping("deleteBTable/{book_tid}")
 @ResponseBody
 public void deleteByBook_TableId(@PathVariable("book_tid") int book_tid) {
    // TODO Auto-generated method stub
    
    btservice. deleteBook_Table(book_tid);
}

}
