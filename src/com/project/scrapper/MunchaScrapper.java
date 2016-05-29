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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Dell
 */
public class MunchaScrapper extends Scrapper {

    productDAO pDAO = new productDAOimpl();

    @Override
    public void Scrap(String link, productDAO pDAO) {
        try {

            String muncha = Grabber.grab(link);

            System.out.println("=================================================================");
            String cakeRegEx = "<a class=\"Block\" href=\"http://www.shop.muncha.com/(.*?)\">(.*?)<div style=(.*?)>(.*?)</div>(.*?)<div style=(.*?)>(.*?)<s style=(.*?)>(.*?)</s>(.*?)</div>";

            Pattern pattern = Pattern.compile(cakeRegEx);
            Matcher matcher = pattern.matcher(muncha);
            while (matcher.find()) {
                product pd = new product();

                pd.setName(matcher.group(4).trim());
                pd.setPrice(matcher.group(7).trim());
                pd.setStoreName("Muncha".trim());
                pDAO.insert(pd);
            }

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
