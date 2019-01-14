package com.codeup.springproject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DiceController {


    @GetMapping("/roll-dice")
    public String guessDice (){
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{x}")
    public String numGuessed (@PathVariable int x, Model model){
        int rdmNum = (int) (Math.random() * 6 + 1);
        model.addAttribute("number", rdmNum);
        if (rdmNum == x){
            model.addAttribute("correct", true);
        } else {
            model.addAttribute("correct", false);

        }
        return "dice-rolled";
    }

}
