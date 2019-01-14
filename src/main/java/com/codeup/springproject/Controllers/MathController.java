package com.codeup.springproject.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

public class MathController {

    @ResponseBody
    @GetMapping("/add/{x}/and/{y}")
    public double add (@PathVariable double x , @PathVariable double y){
        return x + y;
    }

    @ResponseBody
    @GetMapping("/subtract/{x}/from/{y}")
    public double subtract (@PathVariable double x, @PathVariable double y){
        return y- x;
    }

    @ResponseBody
    @GetMapping("/multiply/{x}/and/{y}")
    public double multiply (@PathVariable double x, @PathVariable double y){
        return x * y;
    }

    @ResponseBody
    @GetMapping("/divide/{x}/by/{y}")
    public double divide (@PathVariable double x, @PathVariable double y){
        return x / y;
    }


}
