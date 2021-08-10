package kr.ac.daegu.ysy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //hashmap practice 자바 컬랙션 프레임워크의 일종

        /*
        Map<String, String> keyValueMap = new HashMap<String, String>();
        keyValueMap.put("key1", "value1");  //map 자료구조에 키를 추가한다 (put 사용)
        keyValueMap.put("key2", "value2");
        */

        Map<Integer, String> map = new HashMap<>(); //기본형데이터 (int)x (Integer) o
        map.put(1, "사과");   //1은 int(기본형)데엍인데 Integer라는 참조형 객체에 자동으로 들어가게 되는걸 알 수 있다. : 이걸 autoBoxing 이라 한다
        map.put(2, "포도");   //모든 java의 기본형 데이터에는 wrapper class라는것이 있다
        map.put(3, "바나나");

        System.out.println(map);
        System.out.println(map.get(1)); // key의 값을 기준으로 데이터(value)를 찾는다.

        //entrySet() 활용
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("[Key]:" +entry.getKey() + " [value]:" +entry.getValue());
        }

        System.out.println("============");


        //keySet().iterator()
        //KeySet() 활용
        for(Integer i : map.keySet()){ //저장된 key값 확인
            System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
        }

        System.out.println("==============");

        //keySet().iterator()
        Iterator<Integer> keys = map.keySet().iterator();
        // Iterator : 순서가 없는 자료구조의 list화를 시킬때 쓴다. (순서가 없는 자료구조 : Map, Set),
        // (순서(index번호)가 있는 자료구조 : List-ArrayList, LinkedList)
        while(keys.hasNext()){
            int key = keys.next();
            System.out.println("[Key]:" + key + " [Value]:" +  map.get(key));
        }


        //Map, Set 가장 큰 차이점은 / map (데이터 중복을 허용) , set (공통된 데이터만 보여준다 /두개가 같은 데이터시 하나만 보여준다)
    }
}
