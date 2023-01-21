package com.benarfa.Blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepo postRepo;
    public List<Post> getAllPosts() {
        return postRepo.findAll();
    }
}
