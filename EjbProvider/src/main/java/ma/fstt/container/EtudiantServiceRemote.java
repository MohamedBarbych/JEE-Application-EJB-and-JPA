package ma.fstt.container;

import jakarta.ejb.Remote;
import ma.fstt.entities.Etudiant;
import java.util.List;

@Remote
public interface EtudiantServiceRemote {
    void addEtudiant(Etudiant etudiant);
    Etudiant getEtudiant(int id);
    List<Etudiant> getAllEtudiants();
    void updateEtudiant(Etudiant etudiant);
    void deleteEtudiant(int id);
}
