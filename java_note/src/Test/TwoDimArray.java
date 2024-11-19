package Test;

import java.util.Iterator;
import java.util.ArrayList;

public class TwoDimArray {
    public static void Do() {
        int[][]ints = {{30,40,20},
                {20,10,90},{80,70,20}};

        for(int i = 0;i<ints.length;i++) {
            for (int j = 0; j < ints[1].length; j++) {
                System.out.printf("%d ", ints[i][j]);
            }
        }


        for(int[]i:ints){
                for(int j : i){
                System.out.printf("%d ",(j>50)?1:0);
            }
            System.out.println();
        }

        String[]names = {"ICN","JFK","NRT","LHR"};
        int[]temps = {5,10,12,14};

        for(int i=0;i<names.length;i++){
            System.out.printf("%s : %d\n",names[i],temps[i]);
        }
        System.out.println();

        class AirportTemp{
            private final String name;
            private final int temp;

            AirportTemp(String name,int temp){
                this.name = name;
                this.temp = temp;
            }

            @Override
            public String toString(){
                return name + " : " + temp;
            }
        }

        AirportTemp[]ATS = {
                new AirportTemp("ICN",5),
                new AirportTemp("JFK",10),
                new AirportTemp("NRT",12),
                new AirportTemp("LHR",14),
        };

        for(AirportTemp a : ATS){
            System.out.println(a);
        }


    }
    public static void Mp() {
        String [] subjects = {"I","You","A friend of Mine"};
        String [] verbs = {"play","love","eat"};
        String [] etc = {"a football","to cook"};

        System.out.println((int) (Math.random()*3));
        StringBuilder sb1 = new StringBuilder();
        sb1.append('k'+" ");
        System.out.println(sb1);

        for(int i=0;i<10;i++){
            System.out.println(subjects[(int)(Math.random()*433)%3]+" "+
                    verbs[(int)(Math.random()*433%3)]+" "+
                    etc[(int)(Math.random())*3]+" ");
        }
    }

    public static void Np(){
        String hello = "hello";
       char [] ch = hello.toCharArray();
       StringBuilder sb = new StringBuilder();
       for(int i=ch.length-1;i>=0;i--){
           sb.append(ch[i]);
       }
        System.out.println(sb);
        System.out.println();
    }

}
