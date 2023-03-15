package com.diduy.Application;

//import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {

  @RequestMapping("/about")
  public String about(@RequestParam(name = "name", defaultValue="About") String name, Model model) {
    model.addAttribute("name", name);
    return "About";
  }
}

