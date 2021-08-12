package kr.ac.daegu.ysy;

public class Main {

    public static void main(String[] args) {
    AnnotationHandler handler = new AnnotationHandler();
    AnnotationExam01 exam01 = handler.getInstance(AnnotationExam01.class, InsertIntData.class) //exam01에 해당하는 인스턴스 만든다
            //java8 의 Stream API
            .map(o -> (AnnotationExam01) o) //람다식
            .orElse(new AnnotationExam01());

        AnnotationExam02 exam02 = handler.getInstance(AnnotationExam02.class, InsertStringData.class)
                .map(o -> (AnnotationExam02)o)
                .orElse(new AnnotationExam02());

        System.out.println("myAge = " +exam01.getMyAge());                  //myAge 호출 . Exam01의 Data=30이란 값을 우선으로 생각
        System.out.println("defaultAge = " + exam01.getDefaultAge());       //DefaultGE 호출

        System.out.println("myData = " + exam02.getMyData());
        System.out.println("defaultData = " + exam02.getDefaultData());
    }
}
