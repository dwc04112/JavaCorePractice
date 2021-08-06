package kr.ac.daegu.ysy;

import java.util.ArrayList;

public class page389 {
    /*
        ArrayList test
     */

     public static void main(String[] args){
         ArrayList<String> array = new ArrayList<String>();

         array.add("korea");
         array.add("japan");
         array.add("america");
         array.add("britain");
         System.out.println("ArrayList에 요소 추가 후 출력");
         for(int i=0; i<array.size(); i++){
             System.out.println(array.get(i));
         }
         System.out.println();




         System.out.println("------------------------------------------------------");

         array.remove(0);
         array.remove("japan");

         //index0 / japan옵젝 제거 후 array 내용 전부 출력
         for (String s : array) {
             System.out.println(s);
         }

     }
}
