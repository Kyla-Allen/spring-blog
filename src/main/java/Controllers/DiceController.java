package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DiceController {


    @ResponseBody
    @GetMapping("/roll-dice")
    public String guessDice (){
        return "roll-dice";
    }

    @ResponseBody
    @GetMapping("/roll-dice/${guess}")
    public String numGuessedOne (@PathVariable int guess, Model model){
        int rdmNum = (int) (Math.random() * 6 + 1);
        model.addAttribute("number", rdmNum);
        if (rdmNum == guess){
            model.addAttribute("correct", true);
        } else {
            model.addAttribute("correct", false);

        }
        return "dice-rolled";
    }

}
