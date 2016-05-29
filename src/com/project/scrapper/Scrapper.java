package com.project.scrapper;

import com.project.scrapper.product.product;
import com.project.scrapper.product.productDAO;


/**
 *
 * @author Dell
 */
public abstract class Scrapper {
    private productDAO pDAO;

    public Scrapper() {
    }

    public Scrapper(String name, String price, String storename) {
       
    }

    
    public abstract void Scrap(String link,productDAO pDAO);
    
    public void downloadImage(String link,String fileName){
       
   
    }
}

