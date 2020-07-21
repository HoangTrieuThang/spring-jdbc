package com.thang.springsecurityjdbc;


import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;

@RestController
@ComponentScan
public class HomeResource implements ErrorController {

    private static final String PATH = "/error";

    @GetMapping("/home")
    public String home(){
        return ("<h1>Welcome</h1>");
    }

    @GetMapping("/user")
    public String user(){
        return ("<h1>Welcome user</h1>");
    }

    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Welcome admin</h1>");
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
