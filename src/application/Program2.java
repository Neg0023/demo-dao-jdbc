package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("====TEST 1: department findById ====");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n====TEST 2: departent findAll ====");
        List<Department> list = departmentDao.findAll();
        for (Department obj: list){
            System.out.println(obj);
        }
    }
}
