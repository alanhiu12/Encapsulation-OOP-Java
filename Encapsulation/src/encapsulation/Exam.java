/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author halo4
 */
public class Exam {
    private double score;

    public void setScore(double score) {
        if (score >= 0 && score <= 10) {
            this.score = score;
        } else {
            System.out.println("Cảnh báo: Điểm ngoài phạm vi (0-10). Đưa về 0.");
            this.score = 0;
        }
    }

    public double getScore() { 
        return score; 
    }
}
