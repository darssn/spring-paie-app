package dev.paie.exec;



import org.springframework.stereotype.Controller;

import dev.paie.entite.Entreprise;
import dev.paie.entite.Grade;
import dev.paie.entite.ProfilRemuneration;
import dev.paie.entite.RemunerationEmploye;
import dev.paie.repository.RemunerationEmployeRepository;


public class InsererRemuneration implements Runnable {

    private RemunerationEmployeRepository remunerationEmployeRepository;

    public InsererRemuneration(RemunerationEmployeRepository remunerationEmployeRepository) {

        this.remunerationEmployeRepository = remunerationEmployeRepository;

    }

    @Override
    public void run() {

        RemunerationEmploye renum = new RemunerationEmploye();
        Entreprise e = new Entreprise();
        e.setId(1);
        renum.setMatricule("test1");

        Grade g = new Grade();
        g.setId(1);
        ProfilRemuneration p = new ProfilRemuneration();
        p.setId(1);

        renum.setEntreprise(e);
        renum.setGrade(g);
        renum.setProfilRemuneration(p);

        remunerationEmployeRepository.save(renum);

        
    }

}