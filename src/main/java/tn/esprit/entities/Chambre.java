package tn.esprit.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private long  capaciteChambre;

    @Enumerated
    private tn.esprit.twin3.entities.TypeChambre typeC;
}
