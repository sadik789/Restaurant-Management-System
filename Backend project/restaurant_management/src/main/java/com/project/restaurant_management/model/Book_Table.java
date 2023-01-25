package com.project.restaurant_management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book_Table {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int book_tid;
    private String user_name;
    private String user_email;
    private String date;
    private String time;
    private String Description;
    public Book_Table() {
    }
    
    public Book_Table(int book_tid, String user_name, String user_email, String date, String time, String description) {
        this.book_tid = book_tid;
        this.user_name = user_name;
        this.user_email = user_email;
        this.date = date;
        this.time = time;
        Description = description;
    }

    public int getBook_tid() {
        return book_tid;
    }
    public void setBook_tid(int book_tid) {
        this.book_tid = book_tid;
    }
    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getUser_email() {
        return user_email;
    }
    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "Book_Table [book_tid=" + book_tid + ", user_name=" + user_name + ", user_email=" + user_email
                + ", date=" + date + ", time=" + time + ", Description=" + Description + "]";
    }

    
}
