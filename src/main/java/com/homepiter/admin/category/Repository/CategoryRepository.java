package com.homepiter.admin.category.Repository;

import com.homepiter.admin.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {


    List<Category> findByParentIsNull();

    void updateCategory(Long id, String categoryName);
}
