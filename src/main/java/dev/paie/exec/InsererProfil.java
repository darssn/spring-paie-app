package dev.paie.exec;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;

import dev.paie.entite.Cotisation;
import dev.paie.entite.ProfilRemuneration;
import dev.paie.repository.ProfilRemunerationRepository;


public class InsererProfil implements Runnable {


private ProfilRemunerationRepository profilRemunerationRepository ;

public InsererProfil(ProfilRemunerationRepository profilRemunerationRepository){

this.profilRemunerationRepository = profilRemunerationRepository ;


}

    @Override
    public void run() {

        ProfilRemuneration p = new ProfilRemuneration();
        p.setId(4);
        p.setCode("Prof");
        Cotisation coti = new Cotisation();
        coti.setId(1);
        coti.setCode("SP01");
        coti.setLibelle("URSSAF CSG NON DEDUCTIBLE");
        coti.setImposable(true);
        coti.setTauxSalarial(new BigDecimal("0.02"));
        p.getCotisations().add(coti);

        profilRemunerationRepository.save(p);
        
    }
}