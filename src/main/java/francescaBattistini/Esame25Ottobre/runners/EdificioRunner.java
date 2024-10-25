package francescaBattistini.Esame25Ottobre.runners;

import francescaBattistini.Esame25Ottobre.entities.Edificio;
import francescaBattistini.Esame25Ottobre.exceptions.NotFoundException;
import francescaBattistini.Esame25Ottobre.service.EdificioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Slf4j
@Component
@Order(1)
public class EdificioRunner  implements CommandLineRunner {
    @Autowired
    private EdificioService edificioService;


    @Override
    public void run(String... args) throws Exception {
        Edificio edificio1 = new Edificio("carlos", "via Roma 23","Milano");
        Edificio edificio2 = new Edificio("ginos", "via sandro 43 ","Roma");
        Edificio edificio3 = new Edificio("dams", "via gingol 11","Bari");
        /*  try {
            edificioService.saveEdificio(edificio1);
            edificioService.saveEdificio(edificio2);
            edificioService.saveEdificio(edificio3);
        } catch (NotFoundException ex) {
            log.error(ex.getMessage());
        }*/
    }
}
