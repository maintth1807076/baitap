
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.PhanCong;
import model.PhanCong.PhanCongPK;

public class PhanCongDAO {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("prob10PU");
    EntityManager em;
    
    public void insertPhanCong(PhanCong phanCong) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(phanCong);
        em.getTransaction().commit();
        em.close();
    }
    
    public PhanCong getPhanCong(PhanCongPK pk) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        PhanCong phanCong = em.find(PhanCong.class, pk);
        em.getTransaction().commit();
        em.close();
        return phanCong;
    }
    
    public ArrayList<PhanCong> getPhanCongs() {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<PhanCong> list = em.createQuery("select u from PhanCong u", PhanCong.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return (ArrayList<PhanCong>) list;
    }
    
}
