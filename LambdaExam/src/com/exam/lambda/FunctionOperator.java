package com.exam.lambda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class FunctionOperator {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        int inputN = Integer.parseInt(st.nextToken());

        //Function<T,R>
        //T= 매개변수 를
        //R= 반환값 으로 변환하여 반환
        Function<Integer, String> integerToString = num -> Integer.toString(num);
        String str = integerToString.apply(inputN);
        System.out.println("Integer to str " + str);

        int strToInt = StrToInt(str);
        System.out.println("str to int " + strToInt );
        System.out.println(strToInt == inputN);

        //Operator 타입
        //UnaryOperator<T> 객체 하나를 연산하여 T타입 return
        UnaryOperator<Integer> uo = num -> {return num*10;};
        int resultNum = uo.apply(strToInt);
        System.out.println(resultNum);
        bf.close();
    }

    private static int StrToInt(String str) {
        ToIntFunction<String> strToInt = Integer::parseInt;
        return strToInt.applyAsInt(str);
    }
}
