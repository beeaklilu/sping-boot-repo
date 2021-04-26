package com.example.labthree.service.impl;

import com.example.labthree.domain.Post;
import com.example.labthree.repository.PostRepository;
import com.example.labthree.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    @Override
    public List<Post> getAllPost() {
        return postRepository.getAllPosts();
    }

    @Override
    public Post getPostById(int id) {
        return postRepository.getPostById(id);
    }

    @Override
    public Post addPost(Post post) {
       return postRepository.addPost(post);
    }

    @Override
    public void deletePost(int id) {
        postRepository.deletePost(id);
    }
}
