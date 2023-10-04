package tn.esprit.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;
}
