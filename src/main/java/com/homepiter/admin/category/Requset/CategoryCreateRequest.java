package com.homepiter.admin.category.Requset;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CategoryCreateRequest {
    private String name;
    private Long parentId;


}



