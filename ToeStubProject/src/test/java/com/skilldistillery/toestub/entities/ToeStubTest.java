package com.skilldistillery.toestub.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

class ToeStubTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private ToeStub ts;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("ToeStubProject");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		ts = em.find(ToeStub.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		ts = null;
		em.close();
	}

	@Test
	void test_ToeStub_entity_mapping() {
		assertNotNull(ts);
		assertNotNull(ts.getId());
		assertNotNull(ts.isCrackedNail());
		assertEquals(false, ts.isCrackedNail());
		assertEquals(false, ts.isStillHealing());
		assertEquals(2023, ts.getStubTime().getYear());
		assertTrue(Toe.RIGHTPINKYTOE.equals(ts.getToe()));
		
	}
}
