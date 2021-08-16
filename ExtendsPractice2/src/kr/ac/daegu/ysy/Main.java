package kr.ac.daegu.ysy;

public class Main {

    public static void main(String[] args) {
        School sch1 = new School("김민수", 17,"A");
        System.out.println(sch1.getSchoolInfo());

        student sut1 = new student("김만숭", 18 ,"B",83);
        System.out.println(sut1.getStudentInfo());
    }
}

class School{
    String name;
    int age;
    String classLv;

    public School(String name, int age, String classLv){
    this.name = name;
    this.age = age;
    this.classLv=classLv;
    }

    String getSchoolInfo(){
        return "이름 : " +name+ ", 나이 : " +age+ ", 클래스 : "+classLv;
    }
}

class student extends School{
    int argPoint;

    public student(String name, int age, String classLv, int argPoint){
        super(name,age,classLv);
        this.argPoint = argPoint;
    }

    String getStudentInfo(){
        // return "이름 : "+name+", 나이 : "+age+", 클래스 : "+classLv+ ", 평균점수 : "+argPoint;
        return super.getSchoolInfo() +", 평균점수 = " + argPoint;
    }
}