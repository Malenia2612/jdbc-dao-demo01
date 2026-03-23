package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST 1: Department findByID =====");
		
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: Department insert =====");
		Department newDepartment = new Department(null, "Oficina");
		departmentDao.insert(newDepartment);
		
		System.out.println("Inserted! New id: " + newDepartment.getId());
		
		
		
		System.out.println("\n=== TEST 3: department update =====");
		Department dep1 = departmentDao.findById(3);
		dep1.setName("Guerra");		
		departmentDao.update(dep1);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST 4: department findAll =====");
		List<Department> list = departmentDao.findAll();
		for (Department p : list) {
			System.out.println(p);
		}

	}

}
