package tn.esprit.tpfoyer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@SpringBootTest
@EntityScan("tn.esprit.tpfoyer.entity")
class TpFoyerApplicationTests {

    @Test
    void contextLoads() {
    }

}
