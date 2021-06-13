
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.CauThu;

public class CauThuDAO {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("prob10PU");
    EntityManager em;

    public void insertCauThu(CauThu cauThu) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(cauThu);
        em.getTransaction().commit();
        em.close();
    }
    
    public ArrayList<CauThu> getCauThus() {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<CauThu> list = em.createQuery("select u from CauThu u", CauThu.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return (ArrayList<CauThu>) list;
    }
     
    public CauThu getCauThuByMa(int ma) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        CauThu cauThu = em.find(CauThu.class, ma);
        em.getTransaction().commit();
        em.close();
        return cauThu;
    }
    
    public void updateCauThu(CauThu cauThu) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        CauThu entity = em.find(CauThu.class, cauThu.getMa());
        entity.setHoten(cauThu.getHoten());
        entity.setTuoi(cauThu.getTuoi());
        entity.setLuong(cauThu.getLuong());
        em.getTransaction().commit();
        em.close();
    }
    
}
