package it.piucultura.userprofile.audit.controller;

import it.piucultura.userprofile.audit.PiuCulturaUserProfileAuditApplication;
import it.piucultura.userprofile.audit.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.beans.factory.annotation.Value;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by earthshrek on 06/06/2017.
 */
@Controller
public class PiuCultController {
    private static final Logger log = LoggerFactory.getLogger(PiuCultController.class);

    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "neapolis";
    }

    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome";
    }

}
