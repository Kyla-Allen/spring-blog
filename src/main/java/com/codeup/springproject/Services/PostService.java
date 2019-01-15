package com.codeup.springproject.Services;

import com.codeup.springproject.Model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts;

    public PostService() {
        posts = new ArrayList<>();
        createPosts();
    }

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

    public void save (Post newPost){
        create(newPost);
    }


    //For testing purposes.....
    public void createPosts(){
        create(new Post("Title 1", "Content for title 1"));
        create(new Post("Title 2", "Content for title 2"));
        create(new Post("Title 3", "THE WHISTLING GYPSY ROOOOOOOVEEERRR"));
    }
}
