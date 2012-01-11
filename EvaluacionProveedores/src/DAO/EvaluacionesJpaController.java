/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import DAO.exceptions.NonexistentEntityException;
import Entidad.Evaluaciones;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;

/**
 *
 * @author Darthian
 */
public class EvaluacionesJpaController {

    public EvaluacionesJpaController() {
        emf = Persistence.createEntityManagerFactory("EvaluacionProveedoresPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Evaluaciones evaluaciones) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(evaluaciones);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Evaluaciones evaluaciones) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            evaluaciones = em.merge(evaluaciones);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = evaluaciones.getId();
                if (findEvaluaciones(id) == null) {
                    throw new NonexistentEntityException("The evaluaciones with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Evaluaciones evaluaciones;
            try {
                evaluaciones = em.getReference(Evaluaciones.class, id);
                evaluaciones.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The evaluaciones with id " + id + " no longer exists.", enfe);
            }
            em.remove(evaluaciones);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Evaluaciones> findEvaluacionesEntities() {
        return findEvaluacionesEntities(true, -1, -1);
    }

    public List<Evaluaciones> findEvaluacionesEntities(int maxResults, int firstResult) {
        return findEvaluacionesEntities(false, maxResults, firstResult);
    }

    private List<Evaluaciones> findEvaluacionesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("select object(o) from Evaluaciones as o");
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Evaluaciones findEvaluaciones(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Evaluaciones.class, id);
        } finally {
            em.close();
        }
    }

    public int getEvaluacionesCount() {
        EntityManager em = getEntityManager();
        try {
            return ((Long) em.createQuery("select count(o) from Evaluaciones as o").getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
