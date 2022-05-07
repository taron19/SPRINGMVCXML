package org.contr;

import model.Country;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/req")
public class Requests {

    @GetMapping("/")
    public String firstView() {
        return "first_view";
    }

    @GetMapping("/ask_ques")
    public String string(Model model) {
        model.addAttribute("country", new Country());
        return "asker_view";
    }


    @GetMapping("/res_ques")
    public String resString(@Valid @ModelAttribute("country") Country country, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
           return "asker_view";
            //return "res_view";
        } else {
            return "res_view";
        }
    }

}
