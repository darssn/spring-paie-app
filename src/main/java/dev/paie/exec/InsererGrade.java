package dev.paie.exec;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;

import dev.paie.entite.Grade;
import dev.paie.repository.GradeRepository;

public class InsererGrade implements Runnable {

    private GradeRepository gradeRepository;

    public InsererGrade(GradeRepository gradeRepository) {
        this.gradeRepository = gradeRepository;
    }

    @Override
    public void run() {

        Grade g = new Grade();
        g.setCode("GRADE_D");
        g.setNbHeuresBase(new BigDecimal("300.90"));
        g.setTauxBase(new BigDecimal("300.90"));
        gradeRepository.save(g);

    }

}
