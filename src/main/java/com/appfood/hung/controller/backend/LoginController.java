package com.appfood.hung.controller.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*@Controller
@RequestMapping("backend/")
*//*@PreAuthorize("hasRole('ADMIN')")*//*

public class LoginController {
    @GetMapping("login")
    public String LoginPage() {
        return "backend/login";
    }

}*/
