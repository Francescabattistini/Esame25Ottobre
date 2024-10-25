package francescaBattistini.Esame25Ottobre.service;

import francescaBattistini.Esame25Ottobre.entities.Postazione;
import francescaBattistini.Esame25Ottobre.enumes.TypoPostazione;
import francescaBattistini.Esame25Ottobre.repositories.PostazioneRepository;
import francescaBattistini.Esame25Ottobre.repositories.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PostazioneService {
    @Autowired
    private PostazioneRepository postazioneRepository;




}
