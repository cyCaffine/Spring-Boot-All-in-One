package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @PostMapping("/books")
    public User addBook(@RequestBody User user){

      this.userServices.addBook(user);
      return user;
    }

    // delete user handlere
    @DeleteMapping("/books/{booksId}")
    public User deleteUser(@PathVariable("booksId")int bookId)
    {
       this.userServices.deleteUser(bookId);
      return null;
    }

    // update userut
    @PutMapping("/books/{booksId}")
    public User updateUser(@RequestBody User user, @PathVariable("bookId") int bookId)
    {
    this.userServices.updateUser(user, bookId);
    }
    
}
