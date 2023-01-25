package com.project.restaurant_management.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.restaurant_management.model.Cheaf;
import com.project.restaurant_management.repo.Cheafrepo;
import com.project.restaurant_management.service.CheafService;


@Service
public class CheafServiceImpl implements CheafService {

    @Autowired
    Cheafrepo cheafrepo;

    @Override
    public List<Cheaf> getCheafs() {
        // TODO Auto-generated method stub
        List<Cheaf> lCheafs = cheafrepo.findAll();

        return lCheafs;
    }

    @Override
    public void saveCheaf(Cheaf cheaf) {
        // TODO Auto-generated method stub

        cheafrepo.save(cheaf);

    }

    @Override
    public Cheaf updateCheaf(int cheaf_id, Cheaf cheaf) {
        // TODO Auto-generated method stub

        Cheaf c = cheafrepo.findById(cheaf_id).get();
        c.setCheaf_firstname(cheaf.getCheaf_firstname());
        c.setCheaf_lastname(cheaf.getCheaf_lastname());
        c.setCheaf_education(cheaf.getCheaf_education());
        c.setCheaf_email(cheaf.getCheaf_email());
        c.setCheaf_gender(cheaf.getCheaf_gender());
        c.setCheaf_address(cheaf.getCheaf_address());
cheafrepo.save(c);

        return c;
    }

    @Override
    public void deleteCheaf(int cheaf_id) {
        // TODO Auto-generated method stub
        cheafrepo.deleteById(cheaf_id);

    }
}
