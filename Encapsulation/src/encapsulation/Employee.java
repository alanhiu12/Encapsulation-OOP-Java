/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author halo4
 */
public class Employee {
    private String name;
    private double salary;
    public Employee() {
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Lương không hợp lệ!");
        }
    }
    public void display() {
        System.out.println("Nhân viên: " + name);
        System.out.printf("Mức lương: %,.0f VNĐ\n", salary);
    }
}
