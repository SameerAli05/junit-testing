package com.demo.mockito3;

//import lombok.Data;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;



@Data
@AllArgsConstructor

public class Book {

    private String bookId;
    private String title;
    private int price;
    private LocalDate publishedDate;




}
