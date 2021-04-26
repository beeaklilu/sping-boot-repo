package com.example.labthree.repository.impl;

import com.example.labthree.domain.Post;
import com.example.labthree.repository.PostRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryPostRepository implements PostRepository {
    List<Post> posts = new ArrayList<>();

    public InMemoryPostRepository() {

    }

    @Override
    public List<Post> getAllPosts() {
        return posts;
    }

    @Override
    public Post getPostById(int id) {
        return getAllPosts().stream().filter(post -> post.getId() == id).findFirst().get();
    }

    @Override
    public Post addPost(Post post) {
        posts.add(post);
        return post;
    }

    @Override
    public void deletePost(int id) {
        posts.remove(getPostById(id));

    }

}
