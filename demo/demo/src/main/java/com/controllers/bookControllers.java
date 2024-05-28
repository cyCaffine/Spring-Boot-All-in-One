package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Models.User;
import com.Services.UserServices;

@RestController
public class bookControllers {

    @Autowired
    private  UserServices userServices;
    
    @GetMapping("/books")
    public List <User> getBooks()
    {
      return this.userServices.getAllBooks();
    }
    
    @GetMapping("/books/{id}")
    public User getBook(@PathVariable("id") int id)
    {
        return userServices.getById(id);
    }
}
