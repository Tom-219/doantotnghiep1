package com.appfood.hung.dto;

import com.appfood.hung.entity.Category;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class CategoryDto {
    private Long id;
    private String name;

    public Category convertToCategory(){
        Category category = new Category();
        BeanUtils.copyProperties(this, category);
        return category;
    }
}
