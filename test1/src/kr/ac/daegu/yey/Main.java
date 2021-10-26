package kr.ac.daegu.yey;

public class Main {

    public static void main(String[] args) {
        String[] empno = {"sm001","sm789","sm231","sm325","sm123"};
        int[] salary = {800,250,450,370,700};
        int num=0;
        int sum=0;
        for(int i=0; i < salary.length; i++){

            sum = sum+ salary[i];
            //System.out.println(sum);
            num++;
        }
        System.out.println("전 직원의 수 : " + num);
        System.out.println("월급 급여 합계 : " + sum);
        System.out.println("월 급여 평균 : " + sum/num);
    }
}
