// class firstclass {
//     public static void main(String args[]){
//          System.out.println("hello world");         // println is used to print two lines in diff lines
//         System.out.println("hello world");

//     }
// }


// class firstclass {
//     public static void main(String args[]){
//         System.out.println("*");
//         System.out.println("**");
//         System.out.println("***");
//         System.out.println("****");
//     }
// }


// class firstclass {
//     public static void main(String[] args) {
//         int a = 90;
//         int b = 500;
//         int sum = a + b;
//         System.out.println(sum);
//         int diff = b-a;
//         System.out.println(diff);
//         int mult = a*b;
//         System.out.println(mult);
//         float div = b/a;
//         System.out.println(div);

//     }
// }

// import java.util.*;
// public class firstclass {
//     public static void main (String[] args){
//         Scanner sc = new Scanner (System.in);
//         String name = sc.nextLine();
//         System.out.println(name);
//     }
// }


// import java.util.*;
// public class firstclass {
//     public static void main (String[] args){
//         Scanner sc = new Scanner (System.in);
//         int a  = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a+b;
//         System.out.println(sum);
//     }
// }

// import java.util.*;
// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int age = sc.nextInt();
//         if (age > 18){
//             System.out.println("adult");
//         }
//         else{
//             System.out.println("not adult");
//         }
//     }
// }

// import java.util.Scanner;

// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int num  = sc.nextInt();
//         if (num%2 == 0){
//             System.out.println("even");
//         } else{
//             System.out.println("odd");
//         }

//     }
// }

// import java.util.Scanner;

// public class firstclass{
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         if (a==b){
//             System.out.println("Equal");
//         } else if (a>b){
//             System.out.println("a is greater");
//         }else {
//             System.out.println("b is greater");
//         }
//     }
// }

// import java.util.Scanner;

// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         if (num == 1)
//             System.out.println("Hello");
//         else if (num == 2){
//             System.out.println("Namaste");
//         }
//         else if (num == 3)
//             System.out.println("Bonjour");
//         else 
//             System.out.println("invalid button");
//     }
// }

// import java.util.*;

// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         switch (num) {
//             case 1:
//             System.out.println("hello");
//             break;
//             case 2:
//             System.out.println("Namsate");
//             break;
//             case 3:
//             System.out.println("Bonjour");
//             break;
//             default:
//             System.out.println("invalid button");
//             break;
//         }
//     }
// }

// import java.util.Scanner;

// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("a = ");
//         int a = sc.nextInt();
//         System.out.print("b = ");
//         int b = sc.nextInt();
//         System.out.println("1.addition 2.subtraction 3.multiplication 4.division 5.modulo");
//         int num = sc.nextInt();
//         switch(num){
//             case 1:
//             System.out.println("addition");
//             System.out.println(a+b);
//             break;
//             case 2:
//             System.out.println("subtraction");
//             System.out.println(a-b);
//             break;
//             case 3:
//             System.out.println("multilication");
//             System.out.println(a*b);
//             break;
//             case 4:
//             System.out.println("division");
//             System.out.println(a/b);
//             break;
//             case 5:
//             System.out.println("modulo");
//             System.out.println(a%b);
//             break;
//             default:
//             System.out.println("invalid number");
//         }
//     }
// }

// import java.util.Scanner;

// public class firstclass {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         switch(num){
//             case 1:
//             System.out.println("january");
//             break;
//             case 2:
//             System.out.println("february");
//             break;
//             case 3:
//             System.out.println("march");
//             break;
//             case 4:
//             System.out.println("april");
//             break;
//             case 5:
//             System.out.println("may");
//             break;
//             case 6:
//             System.out.println("june");
//             break;
//             case 7:
//             System.out.println("july");
//             break;
//             case 8:
//             System.out.println("august");
//             break;
//             case 9:
//             System.out.println("september");
//             break;
//             case 10:
//             System.out.println("october");
//             break;
//             case 11:
//             System.out.println("november");
//             break;
//             case 12:
//             System.out.println("december");
//             break;
//             default:
//             System.out.println("invalid input");
//         }
//     }
// }









// import java.util.Scanner;

// public class firstclass{
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         for(int i = 0;i<num;i++){
//             System.out.println("Hello World");
//         }
//     }
// }
// import java.util.Scanner;

// public class firstclass{
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         for(int i = 0;i<num;i++){
//             System.out.println(i);
//         }
//     }
// }


// import java.util.Scanner;

// public class firstclass{
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int i=0;
//         while (i<num) {
//             System.out.println(i);
//             i++;
//         }
        
//     }
// }



// import java.util.Scanner;

// public class firstclass{
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int i=0;
//         do{
//             System.out.println(i);
//             i++;
//         } while(i<num);
//     }
// }



// import java.util.Scanner;

// public class firstclass{
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i=0;i<n;i++){
//             sum = sum +i;
//         }
//         System.out.println(sum);
//     }
// }


// import java.util.Scanner;

// public class firstclass{
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         for(int i = 0;i<11;i++){
//             System.out.println(i*num);
//         }
//     }
// }

// import java.util.Scanner;

// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         do{
//             int marks = sc.nextInt();
//             if (marks >= 90){
//                 System.out.println("This is good");
            
//             } else if (marks>=60 && marks<= 89){
//                 System.out.println("This is also good");
//             } else if (marks>= 0 && marks<=59 ){
//                 System.out.println("This is good as well");
//             }
//         } while (num == 1);
//     }
// }


// import java.util.Scanner;

// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         for(; ;) {
//             System.out.println("Apna College");
//         }

//     }
// }

// import java.util.Scanner;

// public class firstclass {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         boolean isprime = true;
//         for (int i=2 ; i<=num/2;i++){
//             if (num%i==0){
//                 isprime = false;
//                 break;
//             }
//         }
//         if(isprime){
//             if (num == 1){
//                 System.out.println("this is not a prime nor a composite");
//             } else{
//                 System.out.println("this is a prime number ");
//             } 
//             }else {
//                 System.out.println("this is not a prime number");
//         }
//     }
// }

// import java.util.Scanner;

// public class firstclass{
//     public static void main(String srgs[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         for (int i=1;i<=n;i++){
//             for (int j=1;j<=m;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;

// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         for (int i = 1; i<=n;i++){
//             for (int j= 1; j<=m;j++){
//                 if (i == 1 || j == 1 || i == n || j ==m){
//                     System.out.print("*");
//                 } else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;

// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         for (int i = 1; i<=n;i++){
//             for(int j = 1; j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.Scanner;

// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         for (int i = 1; i<=n;i++){
//             for(int j = 0; j<=n-i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// import java.util.Scanner;

// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         for (int i = n; i>=1;i--){
//             for(int j = 1; j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// import java.util.Scanner;

// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         for (int i = 1; i<=n;i++){
//             for(int j = 1; j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// import java.util.Scanner;

// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         for (int i = 1; i<=n;i++){
//             for(int j = 1; j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;

// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i= n;i>=1;i--){
//             for (int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }




// import java.util.Scanner;

// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int num = 1;
        
//         for (int i = 1; i<=n;i++){
//             for(int j = 1; j<=i;j++){
//                 System.out.print(num+" ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;

// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1; i<=n;i++){
//             for (int j=1;j<=i;j++){
//                 if((i+j)%2==0){
//                     System.out.print("1"+" ");
//                 }else {
//                     System.out.print("0"+" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;

// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i=1; i<=n;i++){
//             for(int j=1; j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// import java.util.Scanner;

// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i=1; i<=n;i++){
//             for(int j=1; j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;

// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=i;j>=1;j--){
//                 System.out.print(j);
//             }
//             for(int j=2;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }




// import java.util.*;
// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for (int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for (int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             for (int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//         for(int i=n;i>=1;i--){
//             for (int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for (int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             for (int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//     }
// }




// import java.util.*;
// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");

//             }
//             for (int j=1;j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }


// import java.util.*;
// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=0;i<=n;i++){
//             for (int j=1;j<=(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.*;
// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=0;i<=n;i++){
//             for (int j=0;j<=(n-i);j++){
//                 System.out.print(" ");
//             }
//             for (int j=i;j>=1;j--){
//                 System.out.print(j);
//             }
//             for (int j=2;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.*;
// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=0;i<=n;i++){
//             for (int j=0;j<=(n-i);j++){
//                 System.out.print(" ");
//         }
//         for(int j=1;j<=2*i-1;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//      for(int i=n;i>=1;i--){
//             for (int j=0;j<=(n-i);j++){
//                 System.out.print(" ");
//         }
//         for(int j=1;j<=2*i-1;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//     }
// }


// import java.util.*;
// public class firstclass{
//     public static int calculateSum(int a,int b){
//         int sum = a + b;
//         return sum;
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculateSum(a,b);
//         System.out.println("Sum = " + sum);
        
//     }
// }



// import java.util.*;
// public class firstclass{
//     public static int calculateProduct(int a,int b){
//         int product = a * b;
//         return product;
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int product = calculateProduct(a,b);
//         System.out.println("product = " + product);
        
//     }
// }


// import java.util.*;
// public class firstclass{
//     public static void calculatefactorial(int a){
//         if(a<0){
//             System.out.println("invalid");
//             return;
//         }
//         int factorial = 1;
//         for (int i =a;i>=1;i--){
//             factorial = factorial *i;
//         }
//         System.out.println(factorial);
//         return;
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         calculatefactorial(a);
        
        
//     }
// }


// import java.util.*;
// public class firstclass{
//     public static float average(int a , int b, int c){
//         int avg = (a + b + c)/3;
//         return avg;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         System.out.println(average(a,b,c));
//     }
// }

// import java.util.*;
// public class firstclass{
//     public static int calculateSum(int n){
//         int sum = 0;
//         for (int i=1;i<=n;i+=2){
//             sum+=i;
//         }
//         return sum;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(calculateSum(n));

//     }
// }


// import java.util.*;
// public class firstclass{
//     public static int greater(int a , int b){
//         if(a>b){
//             return a ;
//         }
//         else{
//             return b;
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println(greater(a,b));
//     }
// }


// import java.util.*;
// public class firstclass{
//     public static double circumference(int r){
//         double circum = 2 * 3.14 * r;
//         return circum;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         System.out.println(circumference(r));
//     }

// }




// import java.util.*;
// public class firstclass{
//     public static void eligible(int a){
//         if (a<18){
//             System.out.println("not eligible");
//         }
//         else{
//             System.out.println("eligible");
//         }
//         return;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         eligible(a);
//     }
// }


// import java.util.*;
// public class firstclass{
//     public static float exponential(int x , int n ){
//         int result = 1;
//         for (int i=1;i<=n;i++){
//             result = result * x;
        
//        }
//         return result;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int n = sc.nextInt();
//         System.out.println(exponential(x, n));
//     }
//


// import java.util.*;
// public class firstclass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter size:");
//         int size = sc.nextInt();
//         System.out.println("enter array elements:");
//         int arr[] = new int[size];
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("enter number to be found:");
//         int x = sc.nextInt();
//         for (int i=0;i<size;i++){
//             if(arr[i] == x){
//                 System.out.println("number found at "+i);
//             }
            
//         }

//     }
// }




