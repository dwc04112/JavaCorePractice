package kr.ac.daegu.ysy;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

//p 471 file예제


abstract class Operate {
    abstract void op();
}

class Sum extends Operate {
    @Override
    public void op() {
        int i;
        int sum = 0;
        for(i=1; i<101; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

class Mean extends Operate {
    @Override
    public void op() {
        int i;
        int sum = 0;
        for(i=1; i<101; i++) {
            sum += i;
        }
        System.out.println((double)sum/100);
    }
}

class Prime extends Operate{
    @Override
    public void op() {
        int i, j;
        for(i=2; i<101; i++) {
            for(j=2; j<i; j++) {
                if(i % j == 0) {
                    break;
                }
            }
            if(i==j) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

