package com.br.MinhaAgenda.Repositry;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.br.MinhaAgenda.Model.ProfissionalModel;

public class ProfissionalRepository {
	
	
    private EntityManager entityManager;

    public List<ProfissionalModel> findAll(String nome) {
    	TypedQuery<ProfissionalModel> query = entityManager.createQuery("FROM profissional where nomeProfissional like :nomeProfissional", ProfissionalModel.class);
		query.setParameter("nomeProfissional", "%" + nome + "%");
		
		return query.getResultList();
    }

}
