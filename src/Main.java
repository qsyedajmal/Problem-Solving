import java.util.*;

//Write a program to find the sum of two numbers.
class Sum{
     static public void sum(int i,int j){
        int s=i+j;
        System.out.println(s);
    }
}
//Write a program to find the largest number among three numbers.
class LargestNum{
    static public void largestNum(int i, int j,int k){
        if (i<j){
            if(j<k)
                System.out.println(k);
            else
                System.out.println(j);
        }
        else {
            if (i<k)
                System.out.println(k);
            else
                System.out.println(i);
        }
    }}


//Write a program to check if a number is prime.
class Prime{
    public static void prime(int num){
        boolean prime= true;
        if (num<=1)
            prime=false;

        for (int i=2;i<num;i++){

            if (num%i==0)
                prime=false;
        }
        if (prime)
            System.out.println("It is a prime number");
        else
            System.out.println("It is not a prime number");
    }
}
//Write a program to check if a string is a palindrome.
class Palindrome{
    public static void palindrome(String str){
        String pstr = "";
        for (int i=str.length()-1;i>=0;i--){
            pstr+=str.charAt(i);
        }
        if (str.equalsIgnoreCase(pstr))
            System.out.println("The given string is a palindrome");
        else
            System.out.println("The given string is not a palindrome");
    }
}
//Write a program to calculate the factorial of a number.
class Factorial{
    public static int factorial(int num){
        if (num==0)
            return 1;
        else
            return num*factorial(num-1);
    }
}
//Write a program to find the Fibonacci series up to a given number.
class Fibonacci{
    public static void fibonacci(int num){
        int n1 =0;
        int n2 = 1;
        int n3;
        System.out.print(n1+" "+n2+" ");
        for (int i = 2;i<num;i++){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}
//Write a program to reverse a string.
class ResverseString{
    public static void reverseString(String str){
        String rstr="";
        for (int i=str.length()-1;i>=0;i--){
            rstr+=str.charAt(i);
        }
        System.out.println(rstr);
    }
}
//Write a program to count the occurrence of a specific character in a string.

class OccurrenceOfCharacter{
    public static void occurrenceOfCharacter(String str){
        Map<Character,Integer> ooc = new TreeMap<>();
        str=str.toLowerCase();
        str=str.replace(" ","");
        char[] strarr= str.toCharArray();

        int count=0;

        for (int i =0;i<strarr.length;i++){
            count=0;
            for (int j=0;j< strarr.length;j++){
                if (strarr[i]==strarr[j])
                    count++;
            }
            ooc.put(strarr[i],count);
        }
        for (  var entry : ooc.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}

//Write a program to sort an array in ascending order.
class ArrayAscendindOrder{
    public static void arrayAscendingOrder(int arr[]){

        for (int i=0;i<arr.length;i++){
            int min=i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp =arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for (int a:arr){
            System.out.print(a+" ");
        }
    }
}
//Write a program to find the common elements between two arrays.
class CommonElements{
    public static void commonElements(String[] arr1, String[] arr2){
        Set<String> addCommon = new HashSet<>();
        for (int i=0;i< arr1.length;i++)
        {
            for (int j=0;j< arr2.length;j++)
            {
                if (arr1[i].equals(arr2[j]))
                    addCommon.add(arr1[i]);
            }
        }
        for ( String ac : addCommon){
            System.out.print(ac+" ");
        }
    }

    //Write a program to check if two strings are anagrams.

    public static void commonElements(int[] arr1, int[] arr2){
        Set<Integer> addCommon = new HashSet<>();
        for (int i=0;i< arr1.length;i++)
        {
            for (int j=0;j< arr2.length;j++)
            {
                if (arr1[i]==arr2[j])
                    addCommon.add(arr1[i]);
            }
        }
        for ( int ac : addCommon){
            System.out.print(ac+" ");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        //Sum.sum(5,10);
        //LargestNum.largestNum(50,100,1000);
        //Prime.prime(5);
        //Palindrome.palindrome("Madam");
        //System.out.println(Factorial.factorial(5));
        //Fibonacci.fibonacci(10);//0 1 1 2 3 5 8 13 21 34
        //ResverseString.reverseString("Ajmal");
        //int array[]= {5,4,3,2,1};
        //int[] array2={2,5};
        //ArrayAscendindOrder.arrayAscendingOrder(array);
        //String[] arr1 = { "Article", "in", "Geeks", "for", "Geeks" };
        //String[] arr2 = { "Geeks", "for", "Geeks" };
        //CommonElements.commonElements(array,array2);
        //String name ="Q Syed Ajmal";
        //OccurrenceOfCharacter.occurrenceOfCharacter(name);



    }
}