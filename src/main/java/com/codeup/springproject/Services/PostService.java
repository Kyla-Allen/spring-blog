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

    public Post create(Post post) {
        post.setId(posts.size() + 1);
        posts.add(post);
        return post;
    }


    //For testing purposes.....
    public void createPosts(){
        Post post1 = new Post("Title 1", "Blah blah blah");
        Post post2 = new Post("Title 2", "Content for Title 2");
    }
}
