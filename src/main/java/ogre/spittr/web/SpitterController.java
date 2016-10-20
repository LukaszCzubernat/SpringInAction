package ogre.spittr.web;

import ogre.spittr.Spitter;
import ogre.spittr.data.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/spitter")
public class SpitterController {

    private SpittleRepository spittleRepository;

    @Autowired
    public SpitterController(SpittleRepository spittleRepository) {this.spittleRepository = spittleRepository;}

    @RequestMapping(value = "/register", method = GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute(new Spitter());
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = POST)
    public String processRegistration(@Valid Spitter spitter, Errors errors) {
        if(errors.hasErrors())
            return "registerForm";
        spittleRepository.save(spitter);
        return "redirect:/spitter/".concat(spitter.getUserName());
    }

    @RequestMapping(value = "/{userName}")
    private String showSpitterProfile(@PathVariable String userName, Model model) {
        Spitter spitter = spittleRepository.findByUserName(userName);
        model.addAttribute("spitter", spitter);
        return "profile";
    }
}
