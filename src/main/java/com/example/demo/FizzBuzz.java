package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public String say(int input) {
        // Register condition
        List<Condition> conditions = new ArrayList<>();
        conditions.add(new FizzBuzzCondition());
        conditions.add(new FizzCondition());
        conditions.add(new BuzzCondition());
        conditions.add(new KBTGCondition());
        
        // Process
        for (Condition condition : conditions) { 
            if (condition.check(input)) {
                return condition.say();
            }
        }
        return String.valueOf(input);
        
//       String result = String.valueOf(input);
//       // Buzz
//       BuzzCondition buzzcondition = new BuzzCondition();
//       FizzCondition fizzcondition = new FizzCondition();
//       FizzBuzzCondition fizzbuzzcondition = new FizzBuzzCondition();
//        
//       if (fizzbuzzcondition.check(input)) {
//            return fizzbuzzcondition.say();
//        } else if (fizzcondition.check(input)) {
//            return fizzcondition.say();
//        } else if (buzzcondition.check(input)) { 
//           return buzzcondition.say();
//        }
//        return result;

   } 

//    private boolean หารห้าลงตัว(int input) {
//        return input % 5 == 0;
//    }
    
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
//    private boolean หารสามลงตัว(int input) {
//        return input % 3 == 0;
//    }
}