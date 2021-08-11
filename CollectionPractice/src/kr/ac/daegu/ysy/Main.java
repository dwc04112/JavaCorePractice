package kr.ac.daegu.ysy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Collection (list)
        System.out.println("배열의 경우");
        //배열의 경우
        String[] strs5 = {"1", ",2", "3", "4", "5"};
        //strs 데이터 모두 출력
        for (String s : strs5) {
            System.out.println(s);
        }


//strs 에 6을 추가하시오 : java에서 배열은 초기선언시 배열 길이를 선언 해야한다
//길이가 6인 strs6배열을 추가하고
// strs5 내용을 strs6에 복사하고
//좀더 쉽게 가능한가?
        System.out.println("ArrayList경우");
        List<String> strList = new ArrayList<String>(); //strList의 배열을 기일을 선언시에 지정할 필요가 없고
        //데이터 추가 삭제될때 마다 길이가 동적으로 변화
        strList.add("1");   //index 0 ~
        strList.add("2");
        strList.add("3");
        strList.add("4");
        strList.add("5");   //~index 4
        System.out.println("\"6\"추가 전 List의 길이 : " + strList.size());
        //6을 추가
        strList.add("6");

        //strList 내용 전부 출력하시오
        for (String s : strList) {
            System.out.println(s);
        }


        //list길이
        System.out.println("List의 길이 : " + strList.size());

        //strList 2를 삭제하세요
        strList.remove(1);
        System.out.println("\"2\" 삭제 후");

        //strList 내용 전부 출력하시오
        for (String s : strList) {
            System.out.println(s);
        }

        //strList 에서 "4"인것의 인덱스 번호는 몇번일까
        int indexOf4 = strList.indexOf("4");
        System.out.println("strLIst에서 \"4\" 인 것의 인덱스 번호 : " + indexOf4);
    }
}
