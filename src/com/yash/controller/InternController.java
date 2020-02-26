package com.yash.controller;

import java.util.List;

import com.yash.Entity.Interns;
import com.yash.dao.InternDao;
import com.yash.dao.InternDaoImpl;

public class InternController {
	private InternDao internDao=new InternDaoImpl();
	public List<Interns> getAllInterns(){
		return this.internDao.getAllInterns();
	}
	public void addIntern(Interns intern){
		this.internDao.AddIntern(intern);
	}
}
