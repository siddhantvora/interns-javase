package com.yash.dao;

import java.util.ArrayList;
import java.util.List;

import com.yash.Entity.Interns;

public class InternDaoImpl implements InternDao {
	private  List<Interns> internsList=new ArrayList<>();
	@Override
	public void AddIntern(Interns intern) {
		internsList.add(intern);
	}

	@Override
	public List<Interns> getAllInterns() {

		return internsList;
	}

}
