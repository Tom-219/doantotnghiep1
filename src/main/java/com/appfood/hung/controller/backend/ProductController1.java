

package com.appfood.hung.controller.backend;

import java.util.List;

import com.appfood.hung.dto.ProductDto;
import com.appfood.hung.entity.Category;
import com.appfood.hung.entity.Product;
import com.appfood.hung.service.CategoryService;
import com.appfood.hung.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("backend/")
@Controller
public class ProductController1 {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("listProducts.html")
    public String showExampleView(Model model)
    {
        List<Product> products = productService.getAllProduct();
        model.addAttribute("products", products);
        return "/listProducts.html";
    }
    /*@GetMapping("/")
    public String create(Model model) throws Exception{
        Product product = new Product();
        model.addAttribute("product", product);
        model.addAttribute("categories", categoryService.findAll());
        return "addProduct.html";
    }*/

    @GetMapping("product/new")
    public String createProductForm(Model model) {

        // create student object to hold student form data
        ProductDto p = new ProductDto();
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("productDto", p);
        return "backend/product/create.html";

    }

    @PostMapping("addP")
    public String saveProduct(@ModelAttribute("productDto") ProductDto p, Model model)

    {
        List<Category> list = categoryService.findAll();
        model.addAttribute("categories", list);
        model.addAttribute("productDto",p);
        productService.saveProductToDB(p);
        return "redirect:/product/new";
    }

    @GetMapping("deleteProd/{id}")
    public String deleteProduct(@PathVariable("id") Long id)
    {

        productService.deleteProductById(id);
        return "redirect:/listProducts.html";
    }

    @PostMapping("changeName")
    public String changePname(@RequestParam("id") Long id,
                              @RequestParam("newPname") String name)
    {
        productService.chageProductName(id, name);
        return "redirect:/listProducts.html";
    }
    @PostMapping("changeDescription")
    public String changeDescription(@RequestParam("id") Long id ,
                                    @RequestParam("newDescription") String description)
    {
        productService.changeProductDescription(id, description);
        return "redirect:/listProducts.html";
    }

    @PostMapping("changePrice")
    public String changePrice(@RequestParam("id") Long id ,
                              @RequestParam("newPrice") int price)
    {
        productService.changeProductPrice(id, price);
        return "redirect:/listProducts.html";
    }
}


