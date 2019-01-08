package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DiceController {


    @ResponseBody
    @GetMapping("/roll-dice")
    public String guessDice (){
        return "roll-dice";
    }

    @ResponseBody
    @GetMapping("/roll-dice/{n}")
    public String numGuessed (){
        return "dice-rolled";
    }
}
