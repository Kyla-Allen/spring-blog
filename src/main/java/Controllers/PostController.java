package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @ResponseBody
    @GetMapping("/posts")
    public String posts (){
        return "posts index page";
    }

    @ResponseBody
    @GetMapping("/posts/{id}")
    public String postsId (){
        return "view an individual post";
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
