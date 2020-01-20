package dev.paie.exec;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;

import dev.paie.entite.BulletinSalaire;
import dev.paie.entite.Periode;
import dev.paie.entite.RemunerationEmploye;
import dev.paie.repository.BulletinSalaireRepository;

@Controller
public class InsererBulletin implements Runnable {

    private BulletinSalaireRepository bulletinSalaireRepository;

    public InsererBulletin(BulletinSalaireRepository bulletinSalaireRepository) {

        this.bulletinSalaireRepository = bulletinSalaireRepository;

    }

    @Override
    public void run() {

        BulletinSalaire bS = new BulletinSalaire();

        RemunerationEmploye remu = new RemunerationEmploye();
        remu.setId(1);

        Periode p = new Periode();
        p.setId(1);

        bS.setPeriode(p);
        bS.setRemunerationEmploye(remu);
        bS.setPrimeExceptionnelle(new BigDecimal("100"));

        bulletinSalaireRepository.save(bS);

    }

}