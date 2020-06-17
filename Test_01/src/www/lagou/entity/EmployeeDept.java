package www.lagou.entity;

import java.util.Date;

public class EmployeeDept {
    private String name;
    private Double salary;
    private String deptname;

    public EmployeeDept() {
    }

    public EmployeeDept(String name, Double salary, String deptname) {
        this.name = name;
        this.salary = salary;
        this.deptname = deptname;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    @Override
    public String toString() {
        return "EmployeeDept{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", deptname='" + deptname + '\'' +
                '}';
    }
}
