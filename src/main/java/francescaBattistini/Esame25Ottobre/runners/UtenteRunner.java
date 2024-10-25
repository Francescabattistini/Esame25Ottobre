package francescaBattistini.Esame25Ottobre.runners;

import francescaBattistini.Esame25Ottobre.entities.Utente;
import francescaBattistini.Esame25Ottobre.exceptions.NotFoundException;
import francescaBattistini.Esame25Ottobre.exceptions.ValidationException;
import francescaBattistini.Esame25Ottobre.service.PrenotazioneService;
import francescaBattistini.Esame25Ottobre.service.UtenteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Slf4j
@Component
@Order(2)
public class UtenteRunner implements CommandLineRunner {
        @Autowired
        private UtenteService utenteService;

        @Override
        public void run(String... args) throws Exception {
            Utente Carlo = new Utente("carlopitollo", "carlo pitollo ","carlopitollo@gmail.com");
            Utente Alessia = new Utente("alessia32","alessia giovannetti","alessiagiovannetti@gmail.com");
            Utente Gino = new Utente("ginetto","gino pagino","ginopaggino@gmail.com");

            try {
                utenteService.saveUtente(Carlo);
                utenteService.saveUtente(Alessia);
                utenteService.saveUtente(Gino);
            } catch (NotFoundException ex) {
                log.error(ex.getMessage());
            }

    }

}
