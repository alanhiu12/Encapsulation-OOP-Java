/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author halo4
 */
public class Person {
    private String name;
    private int age;

    public Person() {}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("Lỗi: Tuổi " + age + " không hợp lệ! (Phải từ 0 - 150)");
            this.age = 0; 
            this.age = age;
        }
    }
    public void displayInfo() {
        System.out.println("Tên: " + name + " | Tuổi: " + age);
    }
}
