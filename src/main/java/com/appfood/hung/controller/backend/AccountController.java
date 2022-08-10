package com.appfood.hung.controller.backend;


import com.appfood.hung.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
/*import org.springframework.security.access.prepost.PreAuthorize;*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("backend/account/")
/*@PreAuthorize("hasRole('ADMIN')")*/

public class AccountController {
    @GetMapping("login")
    public String loginPage() {
        return "backend/login";
    }



/*@RequestMapping("detail/{id}")
    public String detail(Model model, @PathVariable Long id) throws Exception {
        model.addAttribute("user", accountService.delete(id));
        return "backend/user/user_detail";
    }*/

}
