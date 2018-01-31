package net.antra.springdata.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.antra.springdata.dao.DepartmentDAO;
import net.antra.springdata.entity.Department;
import net.antra.springdata.entity.DeptEmpCode;

@Service//use service to indicate it is a service layer
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired // Dependency Injection, inject the DAO
	DepartmentDAO deptDAO;
	@Override
	@Transactional // Make the method executed in a transaction // em.getTrasction.begin()
	public void saveDept(Department dept) {
		if(dept.getStatus() == null){
			DeptEmpCode status = new DeptEmpCode();
			status.setcId(1);
			dept.setStatus(status);
		}
		deptDAO.save(dept);
	}
	//em.getTransaction.commit//  

	@Override
	@Transactional
	public List<Department> loadDeptDetails() {
		List<Department> dList = deptDAO.findAllDepartments();
		return dList;
	}

	@Override
	@Transactional
	public List<Department> loadDeptBasicInfo() {
		return deptDAO.findBasicDeptInfo();
	}

}
