/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulation;

/**
 *
 * @author halo4
 */
public class Encapsulation {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(7.5);
        System.out.println("Hình tròn có bán kính: " + c1.getRadius());
        System.out.printf("Diện tích là: %.2f \n", c1.getArea());
        
        
        Book book1 = new Book("Lập trình Java", "Nguyễn Văn A", 150000);
        
        Book book2 = new Book();
        book2.setTitle("Dế Mèn Phiêu Lưu Ký");
        book2.setAuthor("Tô Hoài");
        book2.setPrice(85000);
        
        book1.displayInfo();
        System.out.println(); 
        book2.displayInfo();
        
        Student st = new Student("S001", "Nguyễn Văn Hoàn", 8.5);
        st.setScore(9.0);
        System.out.println("--- Thông tin sinh viên ---");
        st.displayInfo();
        System.out.println("Tên sinh viên là: " + st.getName());
        
        Rectangle rect = new Rectangle();
        rect.setLength(10.5);
        rect.setWidth(5.0);
        
        System.out.println("--- Thông tin hình chữ nhật ---");
        System.out.println("- Chiều dài: " + rect.getLength());
        System.out.println("- Chiều rộng: " + rect.getWidth());
        System.out.println("- Chu vi: " + rect.getPerimeter());
        System.out.println("- Diện tích: " + rect.getArea());
        
        Employee emp = new Employee();
        emp.setName("Trần Văn B");
        emp.setSalary(15000000);
        emp.display();
        emp.setSalary(18500000);
        System.out.println("Lương sau khi tăng: " + emp.getSalary());
        
        Person p = new Person();
        p.setName("Nguyễn Văn A");
        p.setAge(25);
        p.displayInfo();
        System.out.println("--------------------");
        
        p.setAge(200); 
        p.displayInfo();
        System.out.println("--------------------");
        p.setAge(-5);
        p.displayInfo();
        
        User u = new User();
        u.setEmail("account_gmail.com");
        
        Account acc = new Account();
        acc.setPassword("123");
        
        Exam ex = new Exam();
        ex.setScore(12);
        System.out.println("Điểm của bạn là: " + ex.getScore());
    }
    
}
