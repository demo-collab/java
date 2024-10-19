class College {
    int cno;
    String cname;
    String caddr;

    College(int cno, String cname, String caddr) {
        this.cno = cno;
        this.cname = cname;
        this.caddr = caddr;
    }

    void displayCollegeDetails() {
        System.out.println("College No: " + cno);
        System.out.println("College Name: " + cname);
        System.out.println("College Address: " + caddr);
    }
}

class Department extends College {
    int dno;
    String dname;

    Department(int cno, String cname, String caddr, int dno, String dname) {
        super(cno, cname, caddr);
        this.dno = dno;
        this.dname = dname;
    }

    void displayDepartmentDetails() {
        displayCollegeDetails();
        System.out.println("Department No: " + dno);
        System.out.println("Department Name: " + dname);
    }
}

public class CollegeTest {
    public static void main(String[] args) {
        Department dept = new Department(1, "ABC College", "123 Street", 101, "Computer Science");
        dept.displayDepartmentDetails();
    }
}