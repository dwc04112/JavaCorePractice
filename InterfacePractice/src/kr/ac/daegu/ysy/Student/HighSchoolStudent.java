package kr.ac.daegu.ysy.Student;

public class HighSchoolStudent implements Student {
    private String name;
    private int score;

    public  HighSchoolStudent(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override // Override : 메소드 재정의
    public String toString() {
        return "HighSchoolStudent{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public void printStudentInfo() {
        String info = this.toString();
        System.out.println(info);
    }
}
