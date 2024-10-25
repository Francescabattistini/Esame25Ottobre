package francescaBattistini.Esame25Ottobre.service;

import francescaBattistini.Esame25Ottobre.entities.Edificio;
import francescaBattistini.Esame25Ottobre.exceptions.ValidationException;
import francescaBattistini.Esame25Ottobre.repositories.EdificioRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EdificioService {
    @Autowired
    private EdificioRepository edificioRepository;

    public  void saveEdificio(Edificio edif){
        boolean exists = edificioRepository.existsByCitta(edif.getCitta());
        if (exists) {
            throw new ValidationException("non c'è un edificio in questa città ");
        }
        edificioRepository.save(edif);
        log.info("L'edificio " + edif.getNomeEdificio()+ " è stato salvato correttamente!");
    }
}
