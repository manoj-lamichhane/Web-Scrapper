
package com.project.scrapper.product;

import java.util.List;


public interface productDAO {
    
    int insert(product p);
    List<product> getAll();
    List<product> dispinasc();
    List<product> dispindsc();
    
}
