/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author halo4
 */
public class User {
   private String email;

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Lỗi: Email không hợp lệ (thiếu ký tự @)!");
        }
    }

    public String getEmail() { 
        return email; 
    } 
}
