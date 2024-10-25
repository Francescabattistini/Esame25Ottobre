package francescaBattistini.Esame25Ottobre.runners;

import francescaBattistini.Esame25Ottobre.entities.Edificio;
import francescaBattistini.Esame25Ottobre.entities.Postazione;
import francescaBattistini.Esame25Ottobre.enumes.TypoPostazione;
import francescaBattistini.Esame25Ottobre.repositories.EdificioRepository;
import francescaBattistini.Esame25Ottobre.service.PostazioneService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Slf4j
@Component
@Order(3)
public class PostazioneRunner implements CommandLineRunner {
    @Autowired
    private PostazioneService postazioneService;

    @Autowired
    private EdificioRepository edificioRepository;


    @Override
    public void run(String... args) throws Exception {
        Edificio edificio = edificioRepository.findById(1L)
                .orElseThrow(() -> new RuntimeException("Edificio non trovato"));


        Postazione nuovaPostazione = new Postazione("casa",TypoPostazione.OPENSPACE,4);
        nuovaPostazione.setTypoPostazione(TypoPostazione.OPENSPACE);
        nuovaPostazione.setEdificio(edificio);

        Postazione postazioneSalvata = postazioneService.savePostazione(nuovaPostazione);
        log.info("Postazione salvata con ID: " + postazioneSalvata.getId());


    }
}
