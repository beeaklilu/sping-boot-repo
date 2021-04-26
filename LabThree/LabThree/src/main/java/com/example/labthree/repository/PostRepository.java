package com.example.labthree.repository;

import com.example.labthree.domain.Post;

import java.util.List;

public interface PostRepository {

    List<Post> getAllPosts();

    Post getPostById(int id);

    Post addPost(Post post);

    void deletePost(int id);

}
