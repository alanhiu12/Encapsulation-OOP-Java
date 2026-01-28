/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author halo4
 */
public class Student {
    private String id;
    private String name;
    private double score;
    
    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
    
    public Student() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        if (score >= 0 && score <= 10) {
            this.score = score;
        } else {
            System.out.println("Điểm số không hợp lệ (phải từ 0 đến 10)!");
        }
    }
    public void displayInfo() {
        System.out.println("Mã SV: " + id + " | Tên: " + name + " | Điểm: " + score);
    }
}
