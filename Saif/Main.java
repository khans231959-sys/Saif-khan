public class Main{
  public static void main(String[]args){
    System.out.println("saif");
    iimport java.util.*;

 // public class solution{
    
   // public static void main(String[] args) {
     // Scanner sc = new  Scanner(System.in);
     // int age = sc.nextInt();
     // System.out.println(age);
     // short b  = sc.nextShort();
     // System.out.println(b);
     // byte c = sc.nextByte();
     // System.out.println(c);  
    // int a= sc.nextInt();
    //   a = a-5;
    //  a = a+30;
     // a = a*60;
     // a = a/5;
    // System.out.println(a);
    //int a = 24; 
    //int b = 25;
    //if(a+b >=20){
       // System.out.println(a);
    
   //else{
       // System.out.println(b);
  // }
  class characterCheck {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char ch = sc.next().charAt(0);
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
            
            if(ch== 'A' ||ch == 'E'||ch == 'I'|| ch =='O'||ch =='U' ||ch =='a'|| ch== 'e'|| ch== 'i'||ch == 'o'||ch=='u'){
                
                System.out.println("vowel");
            }
        else{
            System.out.println("constant");
        }
        }
        else{
            System.out.println("not an alphabet");
            
        }
        sc.close();
    }
  }
  
        
    
  
    //  int a =10;
       //int b = 10;
       // if(a>b){
        //    System.out.println("yes");
    //    }
      // else{
         //   System.out.println("bda");
      //}
       // System.out.println("equal");
     //   }
    //}
    
  
       // int n = 25;
        //if(n<5 ){
           // System.out.println("divide by 5");
       // }
       // else{
          //  System.out.println("not divide by 5");
      //  }
    
  
      //  int a = 20;
       // int b = 24;
       // if(a+b<18){
//System.out.println("aligibla for vote");
       // }
       // else{
           // System.out.println("not eligibla for vote");
      //  }
    
  
      //  int a= sc.nextInt();
      //  int b = sc.nextInt();
      //  if(a+b <= 20){
           // System.out.println(a);
        
        //else{
           // System.out.println(b);
         //  sc.close();
        // int price = 90;
        // if(price >= 88){
        //    System.out.println("yes");
         
       //  else{
          //  System.out.println("no");
        // int n = 20;
        // if(n<=2){
          //  System.out.println("yes");
        // }
        // else{
        //    System.out.println("no");
         
           
        
        
    
  
  


    

  }
}
// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your CGPA:");
        float CGPA = sc.nextFloat();
        System.out.println("Your Attendence");
        float Attendence = sc.nextFloat();
        System.out.println("Backlog True/False: ");
        boolean Backlog = sc.nextBoolean();
        System.out.println(CGPA);
        System.out.println(Attendence);
        System.out.println(Backlog);
    }
}

// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float CGPA = sc.nextFloat();
        float Attendence = sc.nextFloat();
        float Backlog = sc.nextFloat();
        if(CGPA > 7.0){
        if(Attendence > 75) {
        if(Backlog == 0){
            
        System.out.println("eligible for placement");
        }
            else{
                System.out.println("not eligible for placement");
            }
        }
            else{
                System.out.println("not eligible for placement");
            }
        }
        else{
            System.out.println("not eligible for placement");
        
                }
    } 
}
    
// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hindi = 89;
        int english = 90;
        int math = 91;
        int che = 90;
        int phy = 95;
        int sum = hindi+english+math+che+phy;
        double percentage = (sum/500.0) * 100;
        System.out.println("total"+ sum);
        System.out.println("percentage = " + percentage);
        if(percentage >= 85){
            System.out.println("first");
        }
        else if(percentage>= 75){
            System.out.println("secound divi");
        }
        else if(percentage >= 60){
            System.out.println("third division");
        }
        else{
            System.out.println("fail");
        }
    }
}
             
    

   if(a + b >c && a + c >b  && b + c > a){
            System.out.println("triangle ");
        }
        else {
            System.out.println("not triangle");
        }
        int a = 10;
        int b = 20;
        int c = 30;
      if(a +b>c){
        if(b + a >c){
        if (c+a >b){
     System.out.println("triangle is valid");
        }
            else{
                System.out.println("no");
            }
            }
            else{
              System.out.println("no");
            }
            }
          else{
          System.out.println("no");
          }







          // Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("saif khan");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        
        if(marks>90){
            System.out.println("excellent");
        }
            if(marks >80 && marks <= 90){
                System.out.println("good");
            }
             else if(marks>70 && marks <=80){
                 System.out.println("fair");
             }
        else if(marks>60 && marks <= 70){
            System.out.println("pass");
        }
        else{
            System.out.println("below");
        }
        
            
        
        
        
    }
}

// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static vo id main(String[] args) {
        System.out.println("saif khan");
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int sum = 10;
        for(int i=1; i<= 10; i++){
            if(i%2 == 0){
                sum + = i;
                System.out.println(i+" - even");
            }
            else{
                System.out.println(i+" - not even");
            }
        }
        System.out.println(sum);
    }
}
// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("saif khan");
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int m = 5;
        int malt = 1;
        for(int i=1; i<= 20; i++){
            System.out.println(i);
        }
        System.out.println(malt);
    }
}

                    (// Online Java Compiler (Editor)
// Write and run Java online using this editor.
  import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("saif khan");
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
          int count = 0;
        for(int i = 2; i <= n; i++){
            if(n% i == 0){
                count++;
            }
            System.out.println(i);
        }
        System.out.println(count);
    }
}
// Online Java Compiler (Editor)
// Write and run Java online using this editor.
  import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("saif khan");
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 2; i <= n; i++){
            System.out.println(n*i);
        }
    }
}
// Online Java Compiler (Editor)
// Write and run Java online using this editor.
  import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("saif khan");
        int n =1;
        while(n < 20){
            System.out.println(n);
            n++;
        } 
    }
}


// Online Java Compiler (Editor)
// Write and run Java online using this editor.
  import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("saif khan");
        int n =12345;
        int sum = 0;
        
        while(n != 0){
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
 for(int i =1; i <= 5; i++){
           System.out.println(i);
       }

       // Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("sai khan");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      int sum = 0;
        for(int i =1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}


// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try clicking the Run button.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 123;
        int rev = 1;
        while(n!=0){
            int digit= n% 10;
            rev = rev * 10+ digit;
            n=n/ 10;
        }
        System.out.println(rev);
    }
}

// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try clicking the Run button.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 123;
        int largest = -1;
        while(n !=0){
            int digit= n% 10;
            if(digit >= largest){
                largest = digit;
            }
            
            n=n/ 10;
        }
        System.out.println(largest);
    }
}

// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("saif");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n = 123;
        int rev = 0;
        while(n != 0){
            int digit = n %10;
            rev = rev*10+digit;
            n=n/10;
        }
        System.out.println(rev);
    }
}


// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("saif");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(n != 0){
            int digit = n %10;
            sum = sum + digit*digit*digit;
            n=n/10;
        }
        System.out.println(sum);
        if(sum == temp){
            System.out.println("the number is armstrong");
        }
        else{
            System.out.println("no");
        }
    }
}

// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("saif");
        
        int a = 24;
        int b = 12;
        while(a != 0){
            int rem = b % a;
            b = a;
            a = rem;
        }
        System.out.println(a);
        
    }
} 

// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("saif");
        int a = 4;
        int b = 2;
        int rem = 1;
        int i = 0;
        while(i < a){
            rem = rem *b;
            i++;
        }
        System.out.println("rem: " + rem);
    }
}
// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("saif");
        int n = 50;
        int i = 1;
        int a = 0;
        int b = 1;
        
        while(i <= n){
            
            System.out.println(a);  
            int c = a + b;
            a = b;
            b = c;
            i++;
        } 
    }
}

// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("saif");
       for(int i = 10; i>0; i--){
           System.out.println(i);
       }
    }
}  



// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("saif");
       int i = 5;

        do{
            System.out.println(i);
            i++;
        } while(i <= 5);
    }
}

// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("saif");
        int n = 1234;
      int temp = n;
        int sum = 0;
        while(n != 0){
            int digit = n%10;
            sum = sum + digit*digit*digit*digit;
            n = n/10;
        }
            System.out.println(sum);
        if(sum == temp){
            System.out.println("armstrong");
        }
            else{
                System.out.println("no");
            }
    }
} 

      System.out.println("saif");
      int i =1;
        int sum = 0;
        do{
            System.out.println(i);
            sum += i;
            i++;
        } while(i <= 5);
        System.out.println(sum);
    }
} 

// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("saif");
      int money = 10;
        if(money <=1){
            System.out.println("adiva ja sakti hai ghoomne");
        }
        else{
            System.out.println("adiva nhi ja sakti hai");
        }
    }
}   

// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("saif khan");
        int n = 5;
        for(int i = 1; i <= n; i++){
            for (int space = 1; space <= n - i; space++){ 
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }   
    }     
}                    

// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("saif khan");
        int n = 5;
        for(int i = 1; i <= n; i++){
            for (int space = 1; space <= n - i; space++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();  
        }
     // PART 2: Neeche ka ulta pyramid
        for(int i = n - 1; i >= 1; i--){
            for (int space = 1; space <= n - i; space++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();  
        }
    }
}

// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main { 
    public static void main(String[] args) {
        System.out.println("saif khan");
        int n = 5;
        for(int i = 1; i <= n; i++){
            for (int space = 1; space <= n - i; space++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++){
                if(j == 1 || j == 2 * i - 1){  
                System.out.print("*");   
            }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();  
        }
     // PART 2: Neeche ka ulta Hello Pyramid
        for(int i = n - 1; i >= 1; i--) {
            for (int space = 1; space <= n - i; space++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++){
                if(j == 1 || j == 2 * i - 1){
                System.out.print("*");
            } else{
                    System.out.print(" ");
                }
            }
            System.out.println();  
        }
    }
}

// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("saif khan");
        int n = 5;
        for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n; j++){

            // Boundary (Kinaroo) par star print karo
     if (i == 1 || i == n || j == 1 || j == n){
         System.out.print("*");
     }
            // Ander space print karo
            else{
                System.out.print(" ");
            }
        }
            // Row khatam hone per next line
            System.out.println();
        }
    }
}
hollo diamond;



// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;

class Main {
     static void calculateMarksSum(int [] marks){
         int totalSum = 0;
         for(int i= 0; i < marks.length; i++){
         totalSum += marks[i];
    }
          System.out.println("total marks: " + totalSum);
     }
    
    public static void main(String[]args){
        int[] studentMarks = {75, 82, 90, 69, 88};
        calculateMarksSum(studentMarks);
    }
}

