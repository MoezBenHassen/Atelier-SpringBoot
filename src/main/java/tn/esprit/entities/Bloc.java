package tn.esprit.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomBloc;
    private long capaciteBloc;
}
