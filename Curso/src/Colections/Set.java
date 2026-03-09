package Colections;

import java.util.HashSet;

public class Set {

    public static void main(String[] args) {


        HashSet conjunto = new HashSet();

        conjunto.add(12);
        conjunto.add(true);
        conjunto.add("teste");
        conjunto.add(1.2);
        conjunto.add(1);

        System.out.println(conjunto.size());

        System.out.println(conjunto.isEmpty());

        conjunto.remove(12);
        System.out.println(conjunto.size());

        java.util.Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums);
        conjunto.retainAll(nums);

        System.out.println(conjunto);


    }
}
