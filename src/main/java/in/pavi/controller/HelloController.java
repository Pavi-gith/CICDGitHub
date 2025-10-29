package in.pavi.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    public String displayMessage(){
        return "Successfully pushed";
    }
}
