package com.project.restaurant_management.service;

import java.util.List;

import com.project.restaurant_management.model.Cheaf;

public interface CheafService {
    
    public List<Cheaf>  getCheafs();


    public void  saveCheaf(Cheaf cheaf);

    public Cheaf updateCheaf(int cheaf_id,Cheaf cheaf);

    public void deleteCheaf(int cheaf_id);
}