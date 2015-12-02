/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuprojeto.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 *
 * @author farah
 */
public class DAO {
    
    public static void salvar(Object object){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("MeuProjetoPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        } 
    }
    
    protected static Query criarQuery(String query) {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("MeuProjetoPU");
        EntityManager em = emf.createEntityManager();
        return em.createQuery(query);
    }
    
    public static Object ler(Class classe, long id){
        Object object = null;
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("MeuProjetoPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            object = em.find(classe, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        } 
        return object;
    }
    
    public static void update(Object object){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("MeuProjetoPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.merge(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        } 
    }
}
