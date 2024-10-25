package francescaBattistini.Esame25Ottobre.runners;

import francescaBattistini.Esame25Ottobre.entities.Utente;
import francescaBattistini.Esame25Ottobre.service.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class UtenteRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Utente Carlo = new Utente("carlopitollo","carlo pitollo","carlopitollo@gmail.com");
        Utente Lillo = new Utente("soLillo"," So Lillo","solillo@gmail.com");




    }

}
