package www.lagou.app;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;
import www.lagou.entity.Employee;
import www.lagou.entity.EmployeeDept;
import www.lagou.utils.DruidUtils;

import java.sql.SQLException;
import java.util.List;

public class EmployeeTest {

    @Test
    public void test01() throws SQLException {

        //a) 使用连接池创建QueryRunner对象；
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        //需求1: 查询所有的员工信息 (不包含没有部门的员工)。
        //
        //需求2: 查询每个员工的 姓名, 薪资 和 所属部门名称
        String sql = "SELECT *FROM employee WHERE did is not null";
        List<Employee> employeeList = (List<Employee>) qr.query(sql, new BeanListHandler<Employee>(Employee.class));

        System.out.println(employeeList);
        //需求2: 查询每个员工的 姓名, 薪资 和 所属部门名称
        String sql1 = "SELECT name,salary,deptname FROM employee,dept WHERE employee.did=dept.id";
        List<EmployeeDept> employeeList1 = (List<EmployeeDept>) qr.query(sql1, new BeanListHandler<EmployeeDept>(EmployeeDept.class));

        System.out.println(employeeList1);
    }
}
