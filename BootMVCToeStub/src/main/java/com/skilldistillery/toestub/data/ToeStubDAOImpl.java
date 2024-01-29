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
		return managedTs;
	}

	@Override
	public ToeStub create(ToeStub ts) {
		em.persist(ts);
		return ts;
	}

	@Override
	public ToeStub update(ToeStub ts, int id) {
		ToeStub managedTs = null;
		managedTs = em.find(ToeStub.class, id);
		if(managedTs != null) {
		managedTs.setToe(ts.getToe());
		managedTs.setStubTime(ts.getStubTime());
		managedTs.setCrackedNail(ts.isCrackedNail());
		managedTs.setStillHealing(ts.isStillHealing());
		}
		return managedTs;
	}

	@Override
	public boolean destroy(int id) {
		ToeStub managedTs = em.find(ToeStub.class, id);
		em.remove(managedTs);
		return em.find(ToeStub.class, id) == null;
	}
	
	

}
