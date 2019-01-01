package org.o7planning.springprojectshoppingcart.dao;

import org.o7planning.springprojectshoppingcart.entity.Product;
import org.o7planning.springprojectshoppingcart.model.PaginationResult;
import org.o7planning.springprojectshoppingcart.model.ProductInfo;

public interface ProductDAO {
 
    
    
    public Product findProduct(String code);
    
    public ProductInfo findProductInfo(String code) ;
  
    
    public PaginationResult<ProductInfo> queryProducts(int page,
                       int maxResult, int maxNavigationPage  );
    
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                       int maxNavigationPage, String likeName);
 
    public void save(ProductInfo productInfo);
    
}