package ma.fstt.container;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ma.fstt.entities.Etudiant;
import java.util.List;

@Stateless
public class EtudiantServiceImpl implements EtudiantServiceRemote {

    @PersistenceContext(unitName="Etudiant")
    private EntityManager entityManager;

    @Override
    public void addEtudiant(Etudiant etudiant) {
        entityManager.persist(etudiant);
    }

    @Override
    public Etudiant getEtudiant(int id) {
        return entityManager.find(Etudiant.class, id);
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return entityManager.createQuery("SELECT e FROM Etudiant e", Etudiant.class).getResultList();
    }

    @Override
    public void updateEtudiant(Etudiant etudiant) {
        entityManager.merge(etudiant);
    }

    @Override
    public void deleteEtudiant(int id) {
        Etudiant etudiant = getEtudiant(id);
        if (etudiant != null) {
            entityManager.remove(etudiant);
        }
    }
}
