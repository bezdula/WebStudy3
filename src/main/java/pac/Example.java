package pac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller //tells that class is a web controller
public class Example {

//    if using @Controller annotation:
    @RequestMapping(value = "/formpage", method = RequestMethod.GET)
    public String formpage(Model model){
        model.addAttribute("class1", new Class1());
        return "formpage";
    }

    @RequestMapping(value = "/formpage", method = RequestMethod.POST)
    public String formresult(@ModelAttribute Class1 class1) {
        return "formresult";
    }

}