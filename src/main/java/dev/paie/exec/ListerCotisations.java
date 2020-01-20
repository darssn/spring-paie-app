package dev.paie.exec;

import org.springframework.stereotype.Controller;

import dev.paie.entite.Cotisation;
import dev.paie.repository.CotisationRepository;


public class ListerCotisations implements Runnable {

    private CotisationRepository cotisationRepository;

    public ListerCotisations(CotisationRepository cotisationRepository) {
        this.cotisationRepository = cotisationRepository;

    }

    @Override
    public void run() {

        for(Cotisation c: cotisationRepository.findAll()){

            System.out.println(c.getId()+" - "+c.getCode()+" - "+c.getLibelle());
            
        }
        
    }

}