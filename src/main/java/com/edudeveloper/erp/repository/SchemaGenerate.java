package com.edudeveloper.erp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.edudeveloper.erp.model.Empresa;

public class SchemaGenerate {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EdudeveloperPU");

        EntityManager em = emf.createEntityManager();

        List<Empresa> lista = em.createQuery("from Empresa", Empresa.class).getResultList();

        System.out.println(lista);

        em.close();
        emf.close();
    }
}
