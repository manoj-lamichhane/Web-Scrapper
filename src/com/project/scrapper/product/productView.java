package com.project.scrapper.product;



public class productView {

    private product pd;
    private productDAO productDAO;

    public productView() {
    }

    public productView(product pd, productDAO productDAO) {
        this.pd = pd;
        this.productDAO = productDAO;
    }

    public void add(product p) {
             
            productDAO.insert(p);            
    }

    public void showAll(productDAO pDAO) {
        pDAO.getAll().forEach(s -> {
        System.out.println(s.toString());
        });
    }
}