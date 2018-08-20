package ch.nschaub;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] i=new int[4];
        String hallo="supersupedilasup";
        String nulle="null";
        if(nulle.isEmpty()){
            System.out.println(nulle);
        };
        if(hallo.isEmpty()){
            System.out.println("halli");
        };
        hallo= hallo.replace("sup","1701");
        Arrays.fill(i,5);
        List<Integer> arrayList=Arrays.asList(i);
        System.out.println(Arrays.toString(i));

        System.out.println(hallo.concat("Welt"));
    }
}
