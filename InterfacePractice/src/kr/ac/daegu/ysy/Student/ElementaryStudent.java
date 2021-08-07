package kr.ac.daegu.ysy.Student;

public class ElementaryStudent implements Student {
    private String name; //이름
    private String grade; //학년

    public ElementaryStudent(String name, String grade){
        this.name = name;
        this.grade = grade;
    }

    @Override // Override : 메소드 재정의
    public String toString() {
        return "ElementaryStudent{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    @Override
    public void printStudentInfo() {
        String info = this.toString();
        System.out.println(info);
    }
}
