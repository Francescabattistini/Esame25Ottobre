package francescaBattistini.Esame25Ottobre.entities;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
@Table(name ="edificio")

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
    private String cittaEdificio;

    public Edificio(String nomeEdificio, String indirizzoEdificio, String cittaEdificio) {
        this.nomeEdificio = nomeEdificio;
        this.indirizzoEdificio = indirizzoEdificio;
        this.cittaEdificio = cittaEdificio;
    }
}
