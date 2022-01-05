package com.challenges;

import java.util.*;

public class sorting {
    public static void main(String[] args) {
        // Sorting an array
        Integer[] array = {6,2,6,8,3,7,1};
//        Arrays.sort(array);

        for (int i =0;i<array.length;i++){
            int temp = 0;
            for(int j=i+1;j< array.length;j++){
                if(array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }


        System.out.println(Arrays.toString(array));

        //Sorting an list
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(8);
        integerList.add(3);
        integerList.add(9);
        integerList.add(1);

//        Collections.sort(integerList);
        System.out.println(integerList);

        Collections.reverse(integerList);
        System.out.println(integerList);

        String[] arrayString = {"b","z","e","q"};
        Arrays.sort(arrayString);
        System.out.println(Arrays.toString(arrayString));

        String newString = "ramakrishnan              is a good boy";
        String newString1 = newString.trim().replaceAll(" +"," ");
        System.out.println("New " +newString1);
        for(int i=0;i<newString.length();i++){
            boolean flag= true;
            for(int j=i+1;j<newString.length();j++){
                if(newString.charAt(i) == newString.charAt(j))
                    flag = false;
            }
            if(flag){
                System.out.println(newString.charAt(i));
                break;
            }
        }

        Set<Character> newCharacterSet = new HashSet<>();
        char[] charArray = newString1.toCharArray();
        int temp = 1;

        for(int i=0;i< newString1.length();i++){
            if(newString1.charAt(i)==' '){
                temp++;
            }
        }

        System.out.println("No of words "+temp);

        for(Character c : charArray) {
            if (!newCharacterSet.add(c)) {
                temp = 0;
                break;
            }
        }

    }
}
