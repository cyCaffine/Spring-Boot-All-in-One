package com.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.Models.User;


@Component
public class UserServices {

    private static List<User> list = new ArrayList<>();

    static{
       list.add(new User(12, "Think java", "hello"));
       list.add(new User(112, "Think Android", "hello"));
       list.add(new User(122, "worked java", "hello"));
    }
    // getAllBooks
      public List<User>getAllBooks(){
        return list;
    }

    // get single book by id
    public User getById(int id){
        User userBook = null;
        userBook = list.stream().filter(e ->e.getId()==id).findFirst().get();
        return userBook;
    }

    public User addBook(User user) {

        list.add(user);
        return user;
    }

    public void deleteUser(int bookId) 
    {
         list.stream().filter(book->{
            if(book.getId() != bookId)
            {
                return true;
            }
            return false;
            
         }).collect(Collectors.toList());
    }
    // upadte the user

    public void updateUser(User user, int bookId) {
          list.stream().map(b->{
            
              return b;
          }).collect(Collectors.toList());
    }

   


    
    
}
