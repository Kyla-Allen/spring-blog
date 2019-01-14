package com.codeup.springproject.Services;

import com.codeup.springproject.Model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private List<Post> posts;

    public List<Post> findAll(){
        return posts;
    }

    public Post findById (int id){
        return posts.get(id - 1);
    }

}
