package ma.fstt.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "etudiant")
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_etudiant;
    private String nom;
    private String prenom;
    private String cne;
    private String adresse;
    private String niveau;

    // Default constructor
    public Etudiant() {
    }

    // Constructor with all fields
    public Etudiant(String nom, String prenom, String cne, String adresse, String niveau) {
        this.nom = nom;
        this.prenom = prenom;
        this.cne = cne;
        this.adresse = adresse;
        this.niveau = niveau;
    }

}