package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping("")
    public String index(){
        String html =
                "<h1>Skills Tracker</h1>" +
                "<p>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</p>";
        return html;
    }

    @GetMapping("form")
    public String getForm(){

        return "<form method='post'>" +
                "Name:<br/>" +
                "<input type='text' name='name'/><br/>" +
                "My favorite Language:<br/>" +
                "<select name='language1'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select><br/>" +
                "My second favorite Language:<br/>" +
                "<select name='language2'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select><br/>" +
                "My third favorite Language:<br/>" +
                "<select name='language3'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select><br/>" +
                "<input type='submit'/>" +
                "</form>";
    }

    @PostMapping("form")
    public String formHandler (@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3){
        String html =
                "<h1>" + name + "</h1>" +
                        "<ol>" +
                        "<li>"+ language1 +"</li>" +
                        "<li>" + language2 + "</li>" +
                        "<li>" + language3 + "</li>" +
                        "</ol>";
        return html;
    }
}


//    At localhost:8080, add text that states the three possible programming languages someone could be working on. You need to have an h1 with the title “Skills Tracker”, an h2, and an ol containing three programming languages of your choosing.
//        At localhost:8080/form, add a form that lets the user enter their name and choose their favorite, second favorite, and third favorite programming languages on your list. Use select elements for each of the rankings. Just as with the exercises, we will use @GetMapping().
//        Also at localhost:8080/form, use @PostMapping and @RequestParam to update the HTML with an h1 stating the user’s name and an ol showing the three programming languages in the order they chose.


