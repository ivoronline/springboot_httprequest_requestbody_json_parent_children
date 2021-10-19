package com.ivoronline.springboot_httprequest_requestbody_json_parent_children.controllers;

import com.ivoronline.springboot_httprequest_requestbody_json_parent_children.dto.AuthorDTO;
import com.ivoronline.springboot_httprequest_requestbody_json_parent_children.dto.BookDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MyController {

  //======================================================================================================
  // ADD AUTHOR
  //======================================================================================================
  @ResponseBody
  @RequestMapping("AddAuthor")
  String addAuthor(@RequestBody AuthorDTO authorDTO) {

    //GET AUTHOR DATA
    String        name  = authorDTO.name;
    Integer       age   = authorDTO.age;
    List<BookDTO> books = authorDTO.books;

    //GET BOOKS
    String result =  name + " wrote following books \n" ;
    for (BookDTO book : books) {
      result +=  book.title + "\n";
    }

    //RETURN SOMETHING
    return result;

  }

}

