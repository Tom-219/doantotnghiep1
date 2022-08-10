package com.appfood.hung.controller.backend;


import com.appfood.hung.dto.CategoryDto;
import com.appfood.hung.repository.CategoryRepository;
import com.appfood.hung.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("backend/category/")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("create")
    public String create(Model model) throws Exception {
        CategoryDto dto = new CategoryDto();
        model.addAttribute("categoryDto", dto);
        return "backend/category/create";
    }

    @PostMapping("upload")

        public String save(@ModelAttribute("category") CategoryDto categoryDto) {
            categoryService.save(categoryDto);
            return "redirect:/backend/category/create";
        }

}
