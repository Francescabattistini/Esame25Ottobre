package francescaBattistini.Esame25Ottobre.service;

import francescaBattistini.Esame25Ottobre.entities.Utente;
import francescaBattistini.Esame25Ottobre.exceptions.ValidationException;
import francescaBattistini.Esame25Ottobre.repositories.UtenteRepository;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UtenteService {
    @Autowired
    private UtenteRepository utenteRepository;

 public  void saveUtente(Utente utente){
     boolean exists = utenteRepository.existsByEmail(utente.getEmail());
     if (exists) {
         throw new ValidationException("Email già in uso!");
     }
     utenteRepository.save(utente);
     log.info("L'utente " + utente.getUsername() + " è stato salvato correttamente!");
 }
}
