/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.scrapper;

import com.project.scrapper.product.product;
import com.project.scrapper.product.productDAO;
import com.project.scrapper.product.productDAOimpl;
import com.project.scrapper.util.Grabber;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Dell
 */
public class KMartScrapper extends Scrapper{
    
    productDAO pDAO=new productDAOimpl();
    List<product> plistktmmart=new ArrayList<>();
    
    @Override
    public void Scrap(String link, productDAO pDAO) {
        
                
    try{
        
            
        String ktmmart=Grabber.grab(link);  
        System.out.println("=================================================================");

        String cakeRegEx = "<p>(.*?)</p>(.*?)<p class=\"price\">(.*?)</p>"; 
        
        
        Pattern pattern= Pattern.compile(cakeRegEx);
        Matcher matcher=pattern.matcher(ktmmart);
        while(matcher.find()){ 
        product pd = new product();   
   
        pd.setName(matcher.group(1).trim());
        pd.setPrice(matcher.group(3).trim());
        pd.setStoreName("kathmandu mart".trim());
        pDAO.insert(pd);
        }

    }catch (IOException ioe){
    System.out.println(ioe.getMessage());
    }
    }
}