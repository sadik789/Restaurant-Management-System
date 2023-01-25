package com.project.restaurant_management.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.restaurant_management.model.Book_Table;

public interface Book_Tablerepo extends JpaRepository<Book_Table,Integer>{
    
}
