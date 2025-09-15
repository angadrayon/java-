// import java.util.*;
// public class collegeClass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         double num = sc.nextDouble();
//         double result =  num /2;
//         System.out.println(result);;
//     }
// }


// import java.util.*;
// public class collegeClass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         float a = sc.nextInt();
//         float b = sc.nextInt();
//         float c = sc.nextInt();
//         float result = (a + b )/2;
//         if (result>c){
//             System.out.println("YES");
//         }
//         else{
//             System.out.println("NO");
//         }

//     }
// }




// import java.util.*;
// public class collegeClass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int x = sc.nextInt();
//         int num = n * x;
//         System.out.println(num);
//         if(num>=10000 && num <=99999){
//             System.out.println("yes");
//         }
//         else{
//             System.out.println("no");
//         }
//     }
// }



// import java.util.*;
// public class collegeClass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         if (s.length()%2==0 && s.contains("&") && s.contains("#")){
//             System.out.println("YES");
//         }
//         else{
//             System.out.println("NO");
//         }
//     }
// }



// import java.util.*;
// public class collegeClass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int [] arr = new int[n];
//         for (int i=1;i<=n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int sum = arr[1] + arr[2] + arr[n] + arr[n-1];
//             System.out.println(sum);
//     }
// }



// import java.util.*;
// public class collegeClass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int [] arr = new int[n];
//         for (int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int odd =0;
//         int even =0;
//         for(int j=1;j<=n;j++){
//             if(arr[j] %2==0){
//                 even+=1;
//             }
//             else{
//                 odd+=1;
//             }
//         }
//     }
// }




// import java.util.*;
// public class collegeClass{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         int arr[] = new int[n];
//         for (int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         for (int i = 0; i + 2 * k - 1 < n; i += 2 * k) {
//             for (int j = 0; j < k; j++) {
//                 int temp = arr[i + j];
//                 arr[i + j] = arr[i + k + j];
//                 arr[i + k + j] = temp;
//             }
//         }
//         for (int i=0;i<n;i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }





// import java.util.*;

// public class collegeClass {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         Vector<Integer> vec = new Vector<>();
//         for (int i = 0; i < n; i++) vec.add(sc.nextInt());

//         for (int i = 0; i + 2 * k - 1 < n; i += 2 * k) {
//             for (int j = 0; j < k; j++) {
//                 int temp = vec.get(i + j);
//                 vec.set(i + j, vec.get(i + k + j));
//                 vec.set(i + k + j, temp);
//             }
//         }
//         System.out.println(vec);
//     }
// }




// import java.util.*;
// public class collegeClass{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         Vector<Integer> vec = new Vector<>();
//         for (int i=0; i<n;i++){
//             vec.add(sc.nextInt());
//         }
//         int count = 0 ;
//         for(int x : vec){
//             if (x == 1){
//                 count ++;
//             }
//         }
//         if (count < vec.size()){
//             vec.remove(count);
//         }
//         for(int x : vec){
//             System.out.print(x + " ");
//         }
//     }
// }





import java.util.*;
public class collegeClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<Integer> vec = new Vector<>();
        for(int i=0;i<n;i++){
            vec.add(sc.nextInt());
        }
        int minVal = vec.get(0), maxVal = vec.get(0);
        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (vec.get(i) < minVal) {
                minVal = vec.get(i);
                minIndex = i;
            }
            if (vec.get(i) > maxVal) {
                maxVal = vec.get(i);
                maxIndex = i;
            }
        }
        int start = Math.min(minIndex, maxIndex);
        int end = Math.max(minIndex, maxIndex);

        Vector<Integer> result = new Vector<>();

        for (int i = start; i <= end; i++) result.add(vec.get(i));
        
        for (int i = 0; i < start; i++) result.add(vec.get(i));
        
        for (int i = end + 1; i < n; i++) result.add(vec.get(i));

        for (int x : result) System.out.print(x + " ");
    }
}