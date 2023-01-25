package com.project.restaurant_management.service;

import java.util.List;

import com.project.restaurant_management.model.Book_Table;

public interface Book_TableService {
    
    public List<Book_Table>  getBook_Table();


    public void  saveBook_Table(Book_Table book_Table);

    public Book_Table updateBook_Table(int book_tid,Book_Table book_Table);

    public void deleteBook_Table(int book_tid);


}
