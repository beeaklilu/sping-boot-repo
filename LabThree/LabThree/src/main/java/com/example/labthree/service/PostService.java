package com.example.labthree.service;

import com.example.labthree.domain.Post;

import java.util.List;

public interface PostService {

    List<Post> getAllPost();

    Post getPostById(int id);

    Post addPost(Post post);

    void deletePost(int id);
}
