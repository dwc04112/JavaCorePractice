package com.exam.lambda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class ConsumerSupplier {

    public static void main(String[] args) throws IOException {

        //Consumer<T>
        //사용 후 반환x (void)
        Consumer<String> c = name -> System.out.println(name+"hello");
        c.accept("hello java");

        IntConsumer ic = page -> System.out.println("int ic test " + page);
        ic.accept(54);

        //Supplier<T>
        //입력값은 없고 반환값만
        Supplier<String> ss = () -> "supplier interface have return";
        String result1 = ss.get();
        System.out.println(result1);

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        BooleanSupplier bs = () -> a>b;
        boolean resultBs = bs.getAsBoolean();
        System.out.println(resultBs);
        bf.close();
    }
}
