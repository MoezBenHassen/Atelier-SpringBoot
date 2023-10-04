package tn.esprit.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniversite;
    private String nomUniversite;
    private String adresse;
}
