package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody()
public class HelloController {

    // handles request at /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }
    // handles request at /goodbye
//    @GetMapping("goodbye")
//    public String goodbye(){
//        return "Goodbye, Spring!";
//    }
//
//    //handles requests of the form /hello?name=LaunchCode
//    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST}, value="hello")
//    public String helloWithQueryParam(@RequestParam String name){
//        return "Hello, " + name;
//    }
//
//    //handles requests of the form /hello/LaunchCode
//    @GetMapping("hello/{name}")
//    public String helloWithPathParam(@PathVariable String name){
//        return "Hello, " + name + "!!";
//    }

    @GetMapping(value="")
    public String index(){
        return "Hello, World";
    }

    @GetMapping(value="hello")
    public String helloForm(){
        return
                "<form method='post'>" +
                "<input type='text' name='name'/>" +
                "<select name='language'>" +
                "<option value='english'>English</option>" +
                "<option value='spanish'>Spanish</option>" +
                "<option value='portuguese'>Portuguese</option>" +
                "<option value='french'>French</option>" +
                "<option value='quiche'>Quiche</option>" +
                "</select>" +
                        "<input type='submit' value='Greet Me!'/>" +
                "</form>";
    }

    @RequestMapping(value="hello", method= RequestMethod.POST)
    public String helloPost(@RequestParam String name, @RequestParam String language){
        if (name ==null){
            name = "World";
        }
        return createMessage(name, language);
    }

    private static String createMessage(String n, String l) {
        String greeting = "";

        if (l == "Spanish") {
            greeting = "Hola " + n;
        } else if (l == "portuguese") {
            greeting = "Olá " + n;
        } else if (l == "french") {
            greeting = "Bonjour " + n;
        } else if (l == "quiche") {
            greeting = "Saqarik " + n;
        } else if (l=="english"){
            greeting = "Hello " + n;
        }
        return greeting;
    }
}
