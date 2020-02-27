package com.yash.dao;

import java.util.List;

import com.yash.Entity.Interns;

public interface InternDao {
	public void AddIntern(Interns intern);

	public List<Interns> getAllInterns();
	public Interns getInternById(int id);
	public void updateIntern(Interns intern);

	public void deleteIntern(Interns deleteIntern);
}
