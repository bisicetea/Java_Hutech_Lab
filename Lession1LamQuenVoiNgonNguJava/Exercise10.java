import java.util.*;

class PhanSo
{
    private int tu;
    private int mau;

    //Constructor Default
    PhanSo()
    {
        tu = 0;
        mau = 0;
    }

    //Constructor
    PhanSo(int tu2, int mau2)
    {
        tu = tu2;
        mau = mau2;
    }

    public int getTu()
    {
        return tu;
    }
    public void setTu(int t)
    {
        tu = t;
    }

    public int getMau()
    {
        return mau;
    }
    public void setMau(int m)
    {
        mau = m;
    }

    public void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("-> Nhap tu so: ");
        tu = s.nextInt();
        System.out.print("-> Nhap mau so: ");
        mau = s.nextInt();
        s.close();
    }

    public void output()
    {
        System.out.print(tu + "/" + mau);
    }

    public int UCLN(int a, int b)
    {
        while (a != b)
        {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }

    public void TGPS()
    {
        int i = UCLN(tu, mau);
        tu = tu / i;
        mau = mau / i;
    }

    public void CongPS(PhanSo p)
    {
        int ts = tu * p.mau + p.tu * mau;
        int ms = mau * p.mau;
        PhanSo temp = new PhanSo(ts, ms);
        temp.TGPS();
        temp.output();
    }
}

class Exercise10
{
    public static void main(String[] args)
    {
        PhanSo a = new PhanSo();
        a.input();
        a.TGPS();
        System.out.print("\nPhan so thu nhat: ");
        a.output();
        System.out.print("\nPhan so thu hai: ");
        PhanSo b = new PhanSo(6, 8);
        b.TGPS();
        b.output();
        System.out.print("\n\nCong 2 phan so: ");
        a.CongPS(b);
    }
}
