package com.yash.controller;

import java.util.List;

import com.yash.Entity.Interns;
import com.yash.dao.InternDao;
import com.yash.dao.InternDaoImpl;

public class InternController {
	private static InternController controller;
	private InternDao internDao;
	public List<Interns> getAllInterns(){
		return this.internDao.getAllInterns();
	}
	public Interns getInternById(int id){
		return this.internDao.getInternById(id);
	}
	public void addIntern(Interns intern){
		this.internDao.AddIntern(intern);
	}
	private InternController() {
		internDao=new InternDaoImpl();
	}
	public void updateIntern(Interns intern){
		this.internDao.updateIntern(intern);
	}
	public static InternController getInstance(){
		if(controller == null)
			controller=new InternController();
		return controller;
	}
	public void deleteIntern(Interns deleteIntern) {
		this.internDao.deleteIntern(deleteIntern);
		
	}

}
