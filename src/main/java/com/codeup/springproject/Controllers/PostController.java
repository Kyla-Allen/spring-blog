package com.codeup.springproject.Controllers;

import com.codeup.springproject.Model.Post;
import com.codeup.springproject.Services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {


    //Service Stuff ==========================================
    private final PostService postService;

    public PostController(PostService postService){
        this.postService = postService;
    }


    //Mapping Stuff =============================================
    @GetMapping("/posts")
    public String posts (Model model){
        model.addAttribute("posts", postService.findAll());
        return "/posts/index";
    }

    @GetMapping("/posts/{id}")
    public String postsId (@PathVariable int id, Model model){
        model.addAttribute("id", id);
        model.addAttribute("post", postService.findById(id));
        return "show";
    }

    @GetMapping("/posts/create")
    public String createPost (){
        return "view the form for creating a post";
    }

    @PostMapping("/posts/create")
    public String creatingPost (){
        return "Create a new post";
    }


}
