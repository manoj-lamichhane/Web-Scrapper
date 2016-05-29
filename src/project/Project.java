/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import com.project.scrapper.KMartScrapper;
import com.project.scrapper.MunchaScrapper;
import com.project.scrapper.product.productDAO;
import com.project.scrapper.product.productDAOimpl;
import com.project.scrapper.product.productView;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Project {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KMartScrapper kscrapper= new KMartScrapper();
        MunchaScrapper mscrapper= new MunchaScrapper();
        productDAO pDAO=new productDAOimpl();
        Scanner input=new Scanner(System.in);
        productView pView=new productView();
        
        System.out.println("Enter your search:");
        if(input.next().contains("cake")){
            
                System.out.println("Choose the type:");
                System.out.println("1. Julies");
                System.out.println("2. Soaltee hotel");
                System.out.println("3. Exit");
                System.out.println("Enter your choice[1-3]");
                switch(input.nextInt()){
                    case 1:
                        
                      kscrapper.Scrap("http://kathmandumart.com/index.php?route=product/category&path=63_65_68",pDAO);
                      mscrapper.Scrap("http://www.shop.muncha.com/115/C/Food--Beverages-Cakes-Julies.aspx",pDAO);
                       
                      pView.showAll(pDAO);
                    /*  System.out.println("1. show by ascending price");
                        System.out.println("2. show by descending price");
                        System.out.println("3. Exit");
                        System.out.println("Enter your choice[1-3]");
                        switch(input.nextInt()){
                        
                            case 1:
                                break;
                            case 2:
                                break;
                        */
                       break;
                    case 2:
                        kscrapper.Scrap("http://kathmandumart.com/index.php?route=product/category&path=63_65_107",pDAO);
                        mscrapper.Scrap("http://www.shop.muncha.com/113/C/Food-Items-Cakes-Soaltee-Hotel.aspx",pDAO);
                        pView.showAll(pDAO);
                        break;
                    case 3:
                        System.exit(0);
        }
  
    }
        else{
            System.out.println("Invalid search name");
            System.exit(0);
        }
    }   
}