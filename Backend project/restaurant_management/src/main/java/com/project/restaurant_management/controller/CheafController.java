package com.project.restaurant_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.restaurant_management.model.Cheaf;
import com.project.restaurant_management.service.CheafService;


@RestController
 @CrossOrigin(origins="http://localhost:4200")
@RequestMapping("cheaf")
public class CheafController {
    @Autowired
    CheafService cheafService;

    @GetMapping
    ("get")
    @ResponseBody
    public List<Cheaf> getAllCheaf() {
        // TODO Auto-generated method stub
        List<Cheaf> lCheafs = cheafService.getCheafs();

        return lCheafs;
    }

    @PostMapping("add")
    @ResponseBody
    public void addCheaf(@RequestBody Cheaf cheaf) {
        // TODO Auto-generated method stub

        cheafService.saveCheaf(cheaf);

    }

    @PutMapping("update/{cheaf_id}")
    @ResponseBody
   
 public Cheaf updateCheafById(@PathVariable("cheaf_id")int cheaf_id,@RequestBody Cheaf cheaf) {
        // TODO Auto-generated method stub

        Cheaf c = cheafService.updateCheaf(cheaf_id,cheaf);
 

        return c;
    }

 @DeleteMapping("delete/{cheaf_id}")
 @ResponseBody
 public void deleteByIdCheaf(@PathVariable("cheaf_id") int cheaf_id) {
    // TODO Auto-generated method stub
    cheafService.deleteCheaf(cheaf_id);

}
}
