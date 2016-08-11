package com.urerp.controller;

import com.urerp.domain.Chambre;
import com.urerp.repository.IChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by samuel on 07/08/16.
 */
@RestController
public class ChambreController {

    @Autowired
    private IChambreRepository repository;

    @RequestMapping(value = "/save")
    public Chambre saveChambre(Chambre chambre){
        return repository.save(chambre);
    }

    @RequestMapping(value = "/chambres")
    public List<Chambre> getChambres(){
        List<Chambre> chambres = repository.findAll();
        for(Chambre chambre : chambres){
            System.out.println(chambre.getId()+" "+chambre.getLibelle()+" "+chambre.getPosition()+" "+chambre.getPrix());
        }
        return chambres;
    }

    @RequestMapping(value = "/allChambres")
    public Page<Chambre> getAllChambres(int page){
        return repository.findAll(new PageRequest(page, 5));
    }

    @RequestMapping("/chambreByValue")
    public Page<Chambre> getChambreByValue(String valeur, int page) {
        return repository.findChambreByMotCle("%" + valeur + "%", new PageRequest(page, 5));
    }

    @RequestMapping("/get")
    public Chambre getChambreById(Long ref) {
        return repository.findOne(ref);
    }

    @RequestMapping("/delete")
    public boolean deleteChambreById(Long ref) {
        repository.delete(ref);
        return true;
    }
}
