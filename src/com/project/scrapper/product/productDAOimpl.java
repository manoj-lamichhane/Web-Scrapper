package com.project.scrapper.product;


import java.util.ArrayList;
import java.util.List;

public class productDAOimpl implements productDAO {

    private List<product> pList = new ArrayList<>();

    @Override
    public int insert(product p) {
        pList.add(p);
        return 1;
    }

    @Override
    public List<product> getAll() {
        return pList;
    }

    @Override
    public List<product> dispinasc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<product> dispindsc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }


 