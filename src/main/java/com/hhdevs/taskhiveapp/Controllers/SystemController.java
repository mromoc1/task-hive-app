package com.hhdevs.taskhiveapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemController {

    @GetMapping("/status")
    public String ping() {
        return "Online";
    }
    
}
