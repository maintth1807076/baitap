
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.CauThu;
import model.ViTri;

public class ViTriDAO {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("prob10PU");
    EntityManager em;

    public void insertViTri(ViTri viTri) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(viTri);
        em.getTransaction().commit();
        em.close();
    }
    
     public ArrayList<ViTri> getViTris() {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<ViTri> list = em.createQuery("select u from ViTri u", ViTri.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return (ArrayList<ViTri>) list;
    }
     
    public ViTri getViTriByMa(int ma) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        ViTri viTri = em.find(ViTri.class, ma);
        em.getTransaction().commit();
        em.close();
        return viTri;
    }
    
    public void deleteViTri(int ma) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        ViTri entity = em.find(ViTri.class, ma);
        entity.setStatus(0);
        em.getTransaction().commit();
        em.close();
    }
}
