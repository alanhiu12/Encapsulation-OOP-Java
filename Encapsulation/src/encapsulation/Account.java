/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author halo4
 */
public class Account {
    private String password;

    public void setPassword(String password) {
        if (password != null && password.length() >= 8) {
            this.password = password;
            System.out.println("Mật khẩu đã được thiết lập thành công.");
        } else {
            System.out.println("Lỗi: Mật khẩu phải có ít nhất 8 ký tự!");
        }
    }
}
