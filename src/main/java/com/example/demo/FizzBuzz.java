package com.example.demo;

public class FizzBuzz {
    public String say(int input) {
        if (input == 15) {
            return "FizzBuzz";
        }
        if (หารสามลงตัว(input)) {
            return "Fizz";
        }
        if (input % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(input);

   }
    
//    private String result;
//            public String say(int input) {
//            if (input == 15) {
//                result = "FizzBuzz";
//               
//            }
//            for(int i=0; i<=input; i+=3) {
//                result = "Fizz";
//            }
//            for (int i = 0; i <= input ; i+=5) {
//                result = "Buzz";
//            }
//            return result;
//            
//        }
//
//    
//    public static void main(String[]args) {
//        for (int i = 0; i < 15; i++) {
//            if
//            
//        }
//    }
// public static void main(String[]args) {
//     int[] datas = {1, 2, 3, 4, 5};
//     int length = datas.length;
//     for (int i = 0; i < length; i++) {
//         System.out.println(datas[i]);
//     }
//     // foreach
//     int i=0; 
//     for (int data  : datas) {
//        System.out.println(data);
//        i++;
//    }
// }
    private boolean หารสามลงตัว(int input) {
        return input % 3 == 0;
    }
}