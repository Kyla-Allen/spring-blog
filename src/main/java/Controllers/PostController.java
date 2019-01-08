package Controllers;

import Model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    @ResponseBody
    @GetMapping("/posts")
    public String posts (Model model){
        List<Post> posts = new ArrayList<>();

        //Posts
        Post one = new Post("Puppies are cute", "so are kittens!!!");
        Post two = new Post("Furbies are evil", "They're in your house");

        posts.add(one);
        posts.add(two);

        model.addAttribute("posts", posts);
        return "index";
    }

    @ResponseBody
    @GetMapping("/posts/{id}")
    public String postsId (Model model){
        Post bob = new Post("Bob is lame", "Everyone thinks so");
        model.addAttribute("post", bob);
        return "show";
    }

    @ResponseBody
    @GetMapping("/posts/create")
    public String createPost (){
        return "view the form for creating a post";
    }

    @ResponseBody
    @PostMapping("/posts/create")
    public String creatingPost (){
        return "Create a new post";
    }


}
