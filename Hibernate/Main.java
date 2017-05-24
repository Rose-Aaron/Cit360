package hibernate;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
 
public class Main {
 
    public static void main(String[] args) {
 
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
 
        Department department = new Department();
        department.setDepartmentName("IT");
        session.save(department);
 
        Employee 1 = new Employee("Aaron", "Rose", "4783");
        Employee 2 = new Employee("Luke", "Skywalker", "9120");
 
        emp1.setDepartment(department);
        emp2.setDepartment(department);
 
        session.save(1);
        session.save(2);
 
        session.getTransaction().commit();
        session.close();
    }
}
