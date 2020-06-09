package hanghoa;

import java.util.*;

class HANGHOA
{
    // Properties.
    private String ma;
    private String tenhh;
    private String chatlieu;
    protected long gia;

    // Constructor default.
    HANGHOA()
    {
        ma = tenhh = chatlieu = null;
        gia = 0;
    }
    // Constructor have arguments.
    HANGHOA(String ama, String atenhh, String achatlieu ,long agia)
    {
        ma = ama;
        tenhh = atenhh;
        chatlieu = achatlieu;
        gia = agia;
    }

    // Constructor copy.
    HANGHOA(HANGHOA o)
    {
        ma = o.ma;
        tenhh = o.tenhh;
        chatlieu = o.chatlieu;
        gia = o.gia;
    }

    // Methods.
    public String getMa()
    {
        return ma;
    }
    public void setMa(String bma)
    {
        ma = bma;
    }
    public String getTenHH()
    {
        return tenhh;
    }
    public void setTenHH(String btenhh)
    {
        tenhh = btenhh;
    }
    public long getGia()
    {
        return gia;
    }
    public void setGia(long bgia)
    {
        gia = bgia;
    }
    public String getChatLieu()
    {
        return chatlieu;
    }
    public void setChatLieu(String bchatlieu)
    {
        tenhh = bchatlieu;
    }

    Scanner s = new Scanner(System.in);
    public void input()
    {
        
        System.out.print("-> Nhap ma: ");
        ma = s.nextLine();
        System.out.print("-> Nhap ten hang hoa: ");
        tenhh = s.nextLine();
        System.out.print("-> Nhap chat lieu: ");
        chatlieu = s.nextLine();
        System.out.print("-> Nhap gia: ");
        gia = s.nextLong();
    }

    public void output()
    {
        System.out.format("%-7s %-20s %-20s %-10s\n", ma, tenhh, chatlieu, gia);
    }
}

class DSHH
{
    // Properties.
    HANGHOA hh[];
    private int soluong;

    // Default constructor.
    DSHH()
    {
        hh = null;
        soluong = 0;
    }

    // Copy constructor.
    DSHH(DSHH obj)
    {
        hh = obj.hh;
        soluong = obj.soluong;
    }

    // Methods.
    public int getSoLuong()
    {
        return soluong;
    }
    
    public void setSoLuong(int sl)
    {
        soluong = sl;
    }

    Scanner s = new Scanner(System.in);
    public void input()
    {
        System.out.print("-> Nhap so hang hoa: ");
        soluong = s.nextInt();
        hh = new HANGHOA[soluong];

        for (int i = 0; i < soluong; i++)
        {
            System.out.print("\nThong tin hang hoa 0" + (i + 1) + "\n--------------------------------\n");
            hh[i] = new HANGHOA();
            hh[i].input();
        }
    }

    public void output()
    {
        Title();
        for (int i = 0; i < soluong; i++)
            hh[i].output();
    }

    public void Title()
    {
        System.out.format("\n\n%-7s %-20s %-20s %-10s\n", "Ma", "Ten", "Chat lieu", "Gia");
    }
}

class Demo
{
    public static void main(String[] args)
    {
        DSHH a = new DSHH();
        a.input();
        a.output();
    }
}