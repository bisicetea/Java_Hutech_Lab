package studentinfomation;
public class Student
{
    // Properties.
    private String ID;
    private String Name;
    private String Class;
    private String Gender;
    private float GPA;
    private String Phone;
    private String Email;

    // Constructors.
    Student()
    {
        ID = Name = Class = Gender = Phone = Email = null;
        GPA = 0;
    }
    Student(String ID, String Name, String Class, String Gender, float GPA, String Phone, String Email)
    {
        this.ID = ID;
        this.Name = Name;
        this.Class = Class;
        this.Gender = Gender;
        this.GPA = GPA;
        this.Phone = Phone;
        this.Email = Email;
    }

    // Method: set, get
    public String getID()
    {
        return this.ID;
    }
    public void setID(String ID)
    {
        this.ID = ID;
    }
    public String getName()
    {
        return this.Name;
    }
    public void setName(String Name)
    {
        this.Name = Name;
    }
    public String getCL()
    {
        return this.Class;
    }
    public void setClass(String Class)
    {
        this.Class = Class;
    }
    public String getGender()
    {
        return this.Gender;
    }
    public void setGender(String Gender)
    {
        this.Gender = Gender;
    }
    public float getGPA()
    {
        return this.GPA;
    }
    public void setGPA(float GPA)
    {
        this.GPA = GPA;
    }
    public String getPhone()
    {
        return this.Phone;
    }
    public void setPhone(String Phone)
    {
        this.Phone = Phone;
    }
    public String getEmail()
    {
        return this.Email;
    }
    public void setEmail(String Email)
    {
        this.Email = Email;
    }
}