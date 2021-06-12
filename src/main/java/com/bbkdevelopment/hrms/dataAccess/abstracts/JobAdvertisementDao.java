package com.bbkdevelopment.hrms.dataAccess.abstracts;

import com.bbkdevelopment.hrms.entities.concretes.JobAdvertisement;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
    List<JobAdvertisement> getByIsActive(boolean isActive);

    List<JobAdvertisement> getSortByIsActive(boolean isActive, Sort sort);

    /*Product getByProductName(String productName);

    Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);

    List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);

    List<Product> getByCategory_CategoryIdIn(List<Integer> categories);

    List<Product> getByProductNameContains(String productName);

    List<Product> getByProductNameStartsWith(String productName);

    @Query("From Product where productName=:productName and category.categoryId=:categoryId")
    List<Product> getByNameAndCategory(String productName, int categoryId);

    @Query("Select new kodlamaio.northwind.entities.dtos.ProductWithCategoryDto(p.id, p.productName, c.categoryName) From Category c Inner Join c.products p")
    List<ProductWithCategoryDto> getProductWithCategoryDetails();*/
}
