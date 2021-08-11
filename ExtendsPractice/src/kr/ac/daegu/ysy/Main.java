package kr.ac.daegu.ysy;
//p219 ~ 220


public class Main {

    public static void main(String[] arg){
        Salesman2 sales2 = new Salesman2("오정원", "영업부", 100000000,70000000);
        System.out.println(sales2.getEmployeeInfo());
    }
}
class Employee2 {
    String name;
    String dept;
    int salary;

    public Employee2(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    String getEmployeeInfo(){
        return "이름 : " +name+ ", 부서 : " +dept+", 연봉 : "+salary;
    }
}

//다중상속은 java에서 안된다
class Salesman2 extends Employee2{ //상속
    int commisstion;

    public Salesman2(String name, String dept, int salary, int commition){
        //super() : 부모에게서 상속받은 필드나 메소드를 자식클래스(여기)에서 참조
        super(name,dept,salary);

        this.commisstion = commition;
    }
     /*String getEmployeeInfo(){
         return "이름 : " +name+ ", 부서 : " +dept+", 연봉 : "+salary
                 +", 수당 : "+commisstion;
     }   */
     String getEmployeeInfo(){
         return  super.getEmployeeInfo() + ", 수당 = " + commisstion;
     }
     //부모에게서 상속받은 super.getEmployeeInfo() + 자식클래스에서 정의한 수당
}


