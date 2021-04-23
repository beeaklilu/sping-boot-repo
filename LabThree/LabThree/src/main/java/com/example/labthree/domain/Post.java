package com.example.labthree.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Post {

    long id;
    String title;
    String content;
    String author;
}
