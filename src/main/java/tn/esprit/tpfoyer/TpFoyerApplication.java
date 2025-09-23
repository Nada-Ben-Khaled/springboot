package tn.esprit.tpfoyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("tn.esprit.tpfoyer.entity") // ✅ Obligatoire pour scanner les entités
public class TpFoyerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TpFoyerApplication.class, args);
    }
}