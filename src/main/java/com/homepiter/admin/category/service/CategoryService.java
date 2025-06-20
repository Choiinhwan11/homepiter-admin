package com.homepiter.admin.category.service;

import com.homepiter.admin.category.Requset.CategoryCreateRequest;
import com.homepiter.admin.category.Requset.CategoryDTO;
import com.homepiter.admin.category.Requset.CategoryUpdateRequest;

import java.util.List;

public interface CategoryService {

    List<CategoryDTO> getAllCategories();
//
//    void createCategory(CategoryCreateRequest requset);
//
//    void updateCategory(Long id, CategoryUpdateRequest request);
//
//    void deleteCategory(Long id);
}
