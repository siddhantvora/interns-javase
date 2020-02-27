package com.yash.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

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

	@Override
	public void updateIntern(Interns intern) {
		if(this.internsList.contains(intern)) {
			Interns i = this.internsList.get(this.internsList.indexOf(intern));
			i.setId(intern.getId());
			i.setInternAge(intern.getInternAge());
			i.setInternFirstName(intern.getInternFirstName());
			i.setInternLastName(intern.getInternLastName());
			i.setLevel(intern.getLevel());
		}
		
	}

	@Override
	public Interns getInternById(int id) {
		Interns temp=new Interns();
		temp.setId(id);
		return this.internsList.get(this.internsList.indexOf(temp));
	}

	@Override
	public void deleteIntern(Interns deleteIntern) {
		// TODO Auto-generated method stub
		if(this.internsList.contains(deleteIntern)) {
			this.internsList.remove(deleteIntern);
			System.out.println("deleted");
		}
	}
	

}
