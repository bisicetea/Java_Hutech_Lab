package nhanvien;
import java.util.*;

class NHANVIEN
{
    // Properties.
    private String manv;
    private String tenNV;
    private byte tuoi;
    private String tgTruc;
    private long luong;

    // Default constructor.
    NHANVIEN()
    {
        manv = tenNV = tgTruc = null;
        tuoi = 0;
        luong = 0;
    }

    // Constructor have arguments.
    NHANVIEN(String ma, String ten, byte t, String tg, long l)
    {
        manv = ma;
        tenNV = ten;
        tuoi = t;
        tgTruc = tg;
        luong = l;
    }

    // Copy constructor.
    NHANVIEN(NHANVIEN obj)
    {
        manv = obj.manv;
        tenNV = obj.tenNV;
        tuoi = obj.tuoi;
        tgTruc = obj.tgTruc;
        luong = obj.luong;
    }

    // Methods.
    public String getManv()
    {
        return this.manv;
    }

    public void setManv(String manv)
    {
        this.manv = manv;
    }

    public String getTenNV()
    {
        return this.tenNV;
    }

    public void setTenNV(String tenNV)
    {
        this.tenNV = tenNV;
    }

    public byte getTuoi()
    {
        return this.tuoi;
    }

    public void setTuoi(byte tuoi)
    {
        this.tuoi = tuoi;
    }

    public String getTgTruc()
    {
        return this.tgTruc;
    }

    public void setTgTruc(String tgTruc)
    {
        this.tgTruc = tgTruc;
    }

    public long getLuong()
    {
        return this.luong;
    }

    public void setLuong(long luong)
    {
        this.luong = luong;
    }

    Scanner s = new Scanner(System.in);
    void input()
    {
        System.out.print("-> Nhap ma nhan vien: ");
        manv = s.nextLine();
        System.out.print("-> Nhap ten: ");
        tenNV = s.nextLine();
        System.out.print("-> Nhap tuoi: ");
        tuoi = s.nextByte();
        s.nextLine();
        System.out.print("-> Nhap thoi gian truc: ");
        tgTruc = s.nextLine();
        System.out.print("-> Nhap luong: ");
        luong = s.nextLong();
    }

    void output()
    {
        System.out.format("%-7s %-20s %-4s %-8s %-10s\n", manv, tenNV, tuoi, tgTruc, luong);
    }
}

class DSNV
{
    // Properties.
    NHANVIEN nv[];
    private int sl;

    // Default constructor.
    DSNV()
    {
        nv = null;
        sl = 0;
    }

    // Copy constructor.
    DSNV(DSNV obj)
    {
        nv = obj.nv;
        sl = obj.sl;
    }

    // Methods.
    public int getSl()
    {
        return this.sl;
    }

    public void setSl(int sl)
    {
        this.sl = sl;
    }
    
    Scanner s = new Scanner(System.in);
    public void input()
    {
        System.out.print("-> Nhap so luong nhan vien: ");
        sl = s.nextInt();
        nv = new NHANVIEN[sl];

        for (int i = 0; i < sl; i++)
        {
            System.out.print("\nThong tin nhan vien 0" + (i + 1) + "\n-----------------------------------\n");
            nv[i] = new NHANVIEN();
            nv[i].input();
        }
    }

    public void output()
    {
        Title();
        for (int i = 0; i < sl; i++)
            nv[i].output();
    }

    public void Title()
    {
        System.out.format("\n\n%-7s %-20s %-4s %-8s %-10s\n", "Ma", "Ten", "Tuoi", "TGT", "Luong");
    }
}

class Demo
{
    public static void main(String[] args)
    {
        DSNV a = new DSNV();
        a.input();
        a.output();
    }
}