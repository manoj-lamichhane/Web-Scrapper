/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.scrapper.product;

/**
 *
 * @author Dell
 */
public class product {
 
    String name,StoreName,price;

    public product() {
    }

    public product(String name, String StoreName, String price) {
        this.name = name;
        this.StoreName = StoreName;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String StoreName) {
        this.StoreName = StoreName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cake name=" + name + ", StoreName=" + StoreName + ", price=" + price + '}';
    }
    
}
