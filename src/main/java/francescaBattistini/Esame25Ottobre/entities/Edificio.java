package francescaBattistini.Esame25Ottobre.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name ="edificio")
@ToString

public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    @Column(nullable = false)
    private String nomeEdificio;
    @Column(nullable = false)
    private String indirizzoEdificio;
    @Column(nullable = false)
    private String citta;
    @OneToMany(mappedBy = "edificio")//un edificio per tante postazioni
    @ToString.Exclude
    private List<Postazione> postazioni;

    public Edificio(String nomeEdificio, String indirizzoEdificio, String cittaEdificio) {
        this.nomeEdificio = nomeEdificio;
        this.indirizzoEdificio = indirizzoEdificio;
        this.citta = cittaEdificio;
    }


}
