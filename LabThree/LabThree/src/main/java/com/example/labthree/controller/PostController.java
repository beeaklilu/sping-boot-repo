package com.example.labthree.controller;

import com.example.labthree.domain.Post;
import com.example.labthree.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;


    @GetMapping("/posts")
    public List<Post> getPost(){
        return  postService.getAllPost();
    }

    @GetMapping("/posts/{id}")
    public Post getPostById(@PathVariable int id){
        return postService.getPostById(id);
    }

    @PostMapping("/posts")
    public Post createPost(@RequestBody Post post){
        return postService.addPost(post);
    }

    @DeleteMapping("/posts/{postId}")
    public void deletePost(@PathVariable int postId){
        postService.deletePost(postId);
    }
}
