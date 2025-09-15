// import java.util.*;
// public class javadsa {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         int c = sc.nextInt();
//         int[][] number  = new int[r][c];
//         for(int i=0;i<r;i++){
//             for (int j=0;j<c;j++){
//                  number[i][j] = sc.nextInt();
//             }
//         }
//         for(int i=0;i<r;i++){
//             for (int j=0;j<c;j++){
//                 System.out.print(number[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }



// import java.util.*;
// public class javadsa {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter row");
//         int r = sc.nextInt();
//         System.out.println("enter column");
//         int c = sc.nextInt();
//         System.out.println("enter element");
//         int[][] number  = new int[r][c];
//         for(int i=0;i<r;i++){
//             for (int j=0;j<c;j++){
//                 number[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("enter no. to be found");
//         int x = sc.nextInt();
//         for(int i=0;i<r;i++){
//             for (int j=0;j<c;j++){
//                 if(number[i][j] == x){
//                     System.out.print("element found at "+ "(" + i + "," + j +")");
//                 }
//             }
//         }
//     }
// }



// import java.util.*;
// public class javadsa{
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("Hello");
//         System.out.println(sb);
//         // character at index 0
//         System.out.println(sb.charAt(0));
//         // set char at index 0
//         sb.setCharAt(0,'C');
//         System.out.println(sb);

//         // insert function
//         sb.insert(0, 'd');
//         System.out.println(sb);
//         sb.insert(2, 'l');
//         System.out.println(sb);

//         // delete function
//         sb.delete(2, 3);
//         sb.delete(0, 1);
//         System.out.println(sb);


//         // append 
//         sb.append(" tape");
//         System.out.println(sb);
//     }
// }


// backtracking

// import java.util.*;
// public class javadsa{
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("javacourse");
//         for(int i=0;i<sb.length()/2;i++){
//             int front = i;
//             int back = sb.length() -1 -i;
//             char frontchar =sb.charAt(front);
//             char backchar = sb.charAt(back);
//             sb.setCharAt(front, backchar);
//             sb.setCharAt(back, frontchar);
//         } 
//         System.out.println(sb);
//     }
// }


// import java.util.*;
// public class javadsa{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number of students");
//         int n = sc.nextInt();
//         System.out.println("enter the marks of student");
//         int[] arr = new int[n];
//         for (int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("students less then 35: ");
//         for (int i=0;i<n;i++){
//             if (arr[i]<35){
//                 System.out.println(i);
//             }
//         }


//     }
// }


// import java.util.*;
// public class javadsa{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("number of elements in array");
//         int n = sc.nextInt();
//         System.out.println("elements of array");
//         int[] arr = new int[n];
//         for (int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int sum = 0;
//         for (int i=0;i<n;i++){
//             sum = sum +arr[i];
//         }
//         System.out.println("sum: " + sum);
//     }
// }



// import java.util.*;
// public class javadsa{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("number of elements in array");
//         int n = sc.nextInt();
//         System.out.println("elements of array");
//         int[] arr = new int[n];
//         for (int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int max = 0;
//         for (int i=0;i<n;i++){
//             if(max<arr[i]){
//                 max = arr[i];
//             }
//         }
        
//         System.out.println("maximum element: " + max);
//     }
// }



// import java.util.*;
// public class javadsa{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("number of elements in array");
//         int n = sc.nextInt();
//         System.out.println("elements of array");
//         int[] arr = new int[n];
//         for (int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int max = Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             if (max<arr[i]){
//                 max = arr[i];
//             }
//         }
//         int smax = Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             if (smax<arr[i] && arr[i] != max){
//                 smax = arr[i];
//             }
//         }
//         System.out.println("maximum : " + max);
//         System.out.println("second maximum : " + smax);
//     }
// }



// import java.util.*;
// public class javadsa{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("number of elements in array");
//         int n = sc.nextInt();
//         System.out.println("elements of array");
//         int[] arr = new int[n];
//         for (int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int count = 0;
//         System.out.println("enter the number : ");
//         int x = sc.nextInt();
//         for(int i=0;i<n;i++){
//             if (x<arr[i]){
//                 count++;
//             }
//         }
        
//         System.out.println(count);
//     }
// }



// import java.util.*;
// public class javadsa{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("number of elements in array");
//         int n = sc.nextInt();
//         System.out.println("elements of array");
//         int[] arr = new int[n];
//         for (int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int sum =0;
//         int x = sc.nextInt();
//         for (int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length;j++){

//             }
//         }
//     }
// }



// import java.util.*;
// public class javadsa{
//     public static void print(int[] arr){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("number of elements in array");
//         int n = sc.nextInt();
//         System.out.println("elements of array");
//         int[] arr = new int[n];
//         for (int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         for (int i=0;i< arr.length/2;i++){
//             int j = arr.length -1- i;
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
        
//         }
//         print(arr);
//     }
// }





// import java.util.*;
// public class javadsa{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("no. of groups");
//         int n = sc.nextInt();
//         for (int i=0;i<n;i++){
//             System.out.println("no. of employees");
//             int m = sc.nextInt();
//             int sum = 0;
//             for(int j=0;j<m;j++){
//                 System.out.println("enter salary");
//                 int salary = sc.nextInt();
//                 sum += salary;
//             }
//             System.out.println(sum);
            
//         }
//     }
// }



// import java.util.*;
// public class javadsa{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<arr.length-1;i++){
//             for (int j=0;j<arr.length-1-i;i++){
//                 if (arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         for(int i=0;i<n;i++){

//             System.out.println(arr[i]);
//         }
//     }
// }



import java.util.*;
public class javadsa{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =0;
        int b=1;
        int count = 2;
        while(count>=n){
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}