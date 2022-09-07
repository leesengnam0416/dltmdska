package chapter12;

import java.util.*;

public class HashMapEx3 {
    public static void main(String[]args){

        // Map 객체 생성
        Map map = new HashMap();

        // 이름이 담긴 문자열 배열 생성
        String[] names = {"홍길동","김유신","이순신","강감찬","김유신"};
        // 숫자가 담긴 정수 배열 생성
        int[] nums = {1234,5678,1434,2646,3634};

        // Map 객체에 두 배열의 값들을 키와 밸류 쌍으로 저장
        for (int i=0; i<nums.length; i++){
            map.put(names[i],nums[i]);
        }

        // Map 객체에서 value 들만 조회하기
        Collection values = map.values();

        //향상된 for문으로 출력
        for (Object i : values){
            System.out.println(i);
        }

        // Iterator 객체로 출력
        Iterator it = values.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}