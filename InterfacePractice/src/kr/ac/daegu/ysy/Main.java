package kr.ac.daegu.ysy;

import kr.ac.daegu.ysy.Student.ElementaryStudent;
import kr.ac.daegu.ysy.Student.HighSchoolStudent;
import kr.ac.daegu.ysy.Student.Student;
import kr.ac.daegu.ysy.bank.Bank;
import kr.ac.daegu.ysy.bank.KakaoBank;
import kr.ac.daegu.ysy.bank.ShinhanBank;

import kr.ac.daegu.ysy.pizza.YsyPizza;
import kr.ac.daegu.ysy.pizza.pizzaBaker;





import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //interface란 뭔가? : 서로 다른 객체의 공통된 기능을 쓸 수 있도록 한다.
        /*
        List<String> arrayList = new ArrayList<String>(); //직관적이고 쓰기편함. 많이쓴다
        List<String> linkedList = new LinkedList<String>();


        //arrayList에 string데이터 넣는다
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        //LinkedLIst에 string 데이터 넣는다.
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
         */

        /*
        Bank kakaoBank = new KakaoBank(); //Bank 라는 인터페이스를 구현한 객체여야한다.
        Bank shinhanBank = new ShinhanBank();

        kakaoBank.deposit(10000);
        kakaoBank.withdraw(10000);

        System.out.println("===============");

        shinhanBank.deposit(10000);
        shinhanBank.withdraw(10000);


         */





        //왜쓰는가?
        List<Student> students = new ArrayList<>();
        // 컬렉션 프레임워크에서의 제네릭 : <TYPE> 와 관계된 객체만 넣을수 있다
        students.add(new ElementaryStudent("초딩 이름1", "2학년"));
        students.add(new ElementaryStudent("초딩 이름2", "4학년"));
        students.add(new HighSchoolStudent("고딩 name1", 44));
        students.add(new HighSchoolStudent("고딩 name2", 77));
        // 학생들의 정보를 모두 보여주시오
        for(Student s : students){
            s.printStudentInfo();
        }

        //학생들의 정보를 모두 보여주시오
        for (Student s : students) {

        }

        System.out.println("===========================");

        //위 상황에서 인터페이스를 안쓰고 똑같이 하려면
        List<ElementaryStudent> elementaryStudents = new ArrayList<>();
        elementaryStudents.add(new ElementaryStudent("초딩 이름1", "2학년"));
        elementaryStudents.add(new ElementaryStudent("초딩 이름2", "4학년"));
        List<HighSchoolStudent> highSchoolStudents = new ArrayList<>();
        highSchoolStudents.add(new HighSchoolStudent("고딩 name1", 44));
        highSchoolStudents.add(new HighSchoolStudent("고딩 name2", 77));
        for(ElementaryStudent es : elementaryStudents) {
            es.printStudentInfo();
        }
        for(HighSchoolStudent hs : highSchoolStudents) {
            hs.printStudentInfo();
        }

        System.out.println("===============================================================");

        List<YsyPizza> pizzaBakers = new ArrayList<>();
        pizzaBakers.add(new YsyPizza("호밀빵", "감자", 150));
        pizzaBakers.add(new YsyPizza("밀빵", "고구마",300));

        for(YsyPizza yp : pizzaBakers){
            yp.Pizzadelivery();
        }





    }
    //인터페이스가 어떻게 구현되는가
}
