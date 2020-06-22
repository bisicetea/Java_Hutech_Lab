package swing;
import javax.swing.*;

public class Swing
{
    public static void main(String[] args)
    {
        JFrame f;
        f = new JFrame();// tạo thể hiện của JFrame
 
        JButton b = new JButton("click");// tạo thể hiện của JButton
        b.setBounds(180, 50, 100, 40);
 
        f.add(b);// thêm button vào JFrame
 
        f.setSize(1000, 1000);// thiết lập kích thước cho của sổ
        f.setLayout(null);// không sử dụng trình quản lý bố cục
        f.setVisible(true);// hiển thị cửa sổ
    }
}
