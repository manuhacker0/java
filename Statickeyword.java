class Student {
    int rollno;
    String name;
    static String college;
    static {
        System.out.println("college assigned as MGIT using static block ");
        college = "MGIT";
    }

    static void change() {
        System.out.println("college changed to CBIT using static method ");
        college = "CBIT";
    }

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

class Statickeyword {
    public static void main(String args[]) {
        Student s1 = new Student(541, "Sai Krishna");
        Student.change();
        Student s2 = new Student(548, "Manish");
        s1.display();
        s2.display();
    }
}
manish@DESKTOP-LOFG57V:/mnt/e/manish/programmes/java$ javac Statickeyword.java
manish@DESKTOP-LOFG57V:/mnt/e/manish/programmes/java$ java Statickeyword
college assigned as MGIT using static block 
college changed to CBIT using static method 
541 Sai Krishna CBIT
548 Manish CBIT