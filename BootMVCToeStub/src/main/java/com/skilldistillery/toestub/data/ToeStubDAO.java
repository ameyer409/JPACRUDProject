package com.skilldistillery.toestub.data;

import com.skilldistillery.toestub.entities.ToeStub;

public interface ToeStubDAO {
	public ToeStub getToeStubById(int id);
	
	public ToeStub create(ToeStub ts);

	public ToeStub update(ToeStub ts, int id);
	
	public boolean destroy(int id);
}
