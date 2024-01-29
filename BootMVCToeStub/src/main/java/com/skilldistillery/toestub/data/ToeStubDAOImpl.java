package com.skilldistillery.toestub.data;

import org.springframework.stereotype.Service;

import com.skilldistillery.toestub.entities.ToeStub;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Service
public class ToeStubDAOImpl implements ToeStubDAO{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public ToeStub getToeStubById(int id) {
		ToeStub managedTs = null;
		managedTs = em.find(ToeStub.class, id);
		System.out.println(managedTs);
		return managedTs;
	}

}
