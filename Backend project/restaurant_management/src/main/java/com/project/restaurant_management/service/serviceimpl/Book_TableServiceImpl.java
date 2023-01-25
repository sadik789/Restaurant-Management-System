package com.project.restaurant_management.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.restaurant_management.model.Book_Table;
import com.project.restaurant_management.repo.Book_Tablerepo;
import com.project.restaurant_management.service.Book_TableService;

@Service
public class Book_TableServiceImpl implements Book_TableService 
{

    @Autowired
    Book_Tablerepo  bTablerepo;
    @Override
    public List<Book_Table> getBook_Table() {
        List<Book_Table> book_list=bTablerepo.findAll();
        return book_list;
        
    }
    @Override
    public void saveBook_Table(Book_Table book_Table) {
        // TODO Auto-generated method stub
    bTablerepo.save(book_Table);
        
    }
    @Override
    public Book_Table updateBook_Table(int  book_tid,Book_Table book_Table) {
           Book_Table bTable=bTablerepo.findById(book_tid).get();
           bTable.setUser_name(book_Table.getUser_name());
           bTable.setDate(book_Table.getDate());
           bTable.setTime(book_Table.getTime());
           bTable.setDescription(book_Table.getDescription());
           bTable.setUser_email(book_Table.getUser_email());
           bTablerepo.save(bTable);
        return bTable;
    }

     @Override
     public void deleteBook_Table(int book_tid) {
         // TODO Auto-generated method stub
         
         bTablerepo.deleteById(book_tid);
     }
    
}
