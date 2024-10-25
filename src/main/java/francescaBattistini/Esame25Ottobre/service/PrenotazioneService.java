package francescaBattistini.Esame25Ottobre.service;

import francescaBattistini.Esame25Ottobre.entities.Prenotazione;
import francescaBattistini.Esame25Ottobre.entities.Utente;
import francescaBattistini.Esame25Ottobre.exceptions.ValidationException;
import francescaBattistini.Esame25Ottobre.repositories.PrenotazioneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@Slf4j
public class PrenotazioneService {
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public List<Prenotazione> getPrenotazioniByUtenteAndGiorno(Utente utente, LocalDate giornoPrenotazione) {
        return prenotazioneRepository.findByUtenteAndGiornoPrenotazione(utente, giornoPrenotazione);
    }

    public boolean existsPrenotazioneByGiorno(LocalDate giornoPrenotazione) {
        return prenotazioneRepository.existByGiornoPrenotazione(giornoPrenotazione);
    }

    public void savePrenotazione(Prenotazione prenotazione) {
        boolean exists = prenotazioneRepository.existByGiornoPrenotazione(prenotazione.getGiornoPrenotazione());
            if (exists) {
                throw new ValidationException("prenotazione già esistente!");
            }
            prenotazioneRepository.save(prenotazione);
            log.info("La prenotazione " + prenotazione.getId() + " è stata salvata correttamente!");

    }
    // non ho finito ma ce l'ho messa tutta 
    }

