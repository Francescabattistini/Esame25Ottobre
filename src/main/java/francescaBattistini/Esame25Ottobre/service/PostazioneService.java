package francescaBattistini.Esame25Ottobre.service;

import francescaBattistini.Esame25Ottobre.entities.Postazione;
import francescaBattistini.Esame25Ottobre.enumes.TypoPostazione;
import francescaBattistini.Esame25Ottobre.repositories.PostazioneRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PostazioneService {
    @Autowired
    private PostazioneRepository postazioneRepository;

    public Postazione savePostazione(Postazione postazione) {
        return postazioneRepository.save(postazione);
    }


    public List<Postazione> getPostazioniByTypoPostazione(TypoPostazione typoPostazione) {
        return postazioneRepository.findByTypoPostazione(typoPostazione);
    }


}
