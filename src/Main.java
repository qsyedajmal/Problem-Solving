import java.io.PrintStream;
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
    public static void factorial (int num){

        int fact=1;

        for (int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println(fact);
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

//Write a program to check if two strings are anagrams.

class Anagram {
    public static void anagram(String str1, String str2){

        if (str1.length()!=str2.length()){
            System.out.println("This strings are not an anagram");
        }
        else {
            char[] str1c = str1.toLowerCase().toCharArray();
            char[] str2c = str2.toLowerCase().toCharArray();

            Arrays.sort(str1c);
            Arrays.sort(str2c);

            if(Arrays.equals(str1c,str2c)){
                System.out.printf("This strings are an anagram");
            }

        }
    }
}
//Write a program to find the maximum and minimum elements in an array.
class MinAndMax{
    public static void minAndMax(int[] arr){

        int min=arr[0];
        int max=arr[0];

        for (int i=0;i<arr.length;i++){
            if (min>arr[i])
                min=arr[i];
            if (max<arr[i])
                max=arr[i];
        }
        System.out.println("The minimum number is "+min);
        System.out.println("The maximum number is "+max);
    }
}
//Write a program to remove duplicates from an array.

class RemoveDuplicate{
    public static  void removeDuplicate ( int[] arr){

        for (int i=0; i< arr.length;i++){
            for (int j=i+1; j< arr.length;j++){
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                }
            }
        }
        for (int k=0;k<arr.length;k++){
            if (arr[k]!=-1)
                System.out.print(arr[k]+" ");
        }
    }
}
//Write a program to find the second largest element in an array.

class SecondLargest{

    public static void secondLargest(int[] arr){

        int maximum =Integer.MIN_VALUE;
        int secondmaximum = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){

            if(arr[i]>maximum){
                secondmaximum=maximum;
                maximum=arr[i];
            }

            if (arr[i]<maximum && arr[i]>secondmaximum){
                secondmaximum=arr[i];
            }
        }
        System.out.println("The second maximum number is "+ secondmaximum);
    }

}

//Write a program to check if a string is a valid palindrome ignoring non-alphanumeric characters.
class PalindromeNonAlphanumeric{
    public static boolean palindromeNonAlphanumeric (String str){
        str.toLowerCase();

        int start = 0;
        int end = str.length()-1;

        while(start<=end){

            char s = str.charAt(start);
            char e = str.charAt(end);

            if (!(s>='a'&& s<='z'))
                start++;
            else if (!(e>='a'&& e<='z'))
                end--;
             else if (e==s){
                start++;
                end--;
             }
            else
                return false;
        }
        return true;
    }
}

class PerfectNumber{
    public static void perfectNumber(int number){
//        int num=number;
        int count=0;
        if (number==1)
            System.out.println("The given number is a perfect number");
        else {
            for (int i=1;i<number;i++){
                if (number%i==0)
                    count=count+i;
            }
            if (number==count)
                System.out.println("The given number is a perfect number");
            else
                System.out.println("it is not a perfect number");
        }

    }
}

class Power{
    public static int power(int base, int exponent){

        if (exponent==0)
            return 1;

        return base*power(base,exponent-1);
    }
}
//Write a program to find the GCD (Greatest Common Divisor) of two numbers.
class GCD{

    public static void gCD(int num1, int num2){
        int g=0;

        for (int i=1;i<num1;i++){
            if (num1%i==0&&num2%i==0)
                g=i;
        }
        System.out.println(g);
    }
}
class LCM{

    public static void lCM(int num1,int num2){
        int num=0;
        for (int i=1;i<=num2;i++)
        {
            if (num1%i==0&&num2%i==0) {
                 num =i;
            }
        }
        int lcm = num1*num2/num;
        System.out.println(lcm);
    }
}
//Write a program to check if a number is an Armstrong number.
class ArmstrongNumber{
    public static void armstrongNumber(int num){

        int num1=num;
        int sum =0;
        int rem;

        while(num>0){
            rem=num%10;
            sum+=(rem*rem*rem);
            num=num/10;
        }
        if (num1==sum)
            System.out.println("The given number is a armstrong number");
        else
            System.out.println("The given number is not a armstrong number");
    }
}
//Write a program to reverse an integer number.
class ReverseAnInteger{
    public static void reverseAnInteger(int num){
        int rem;
        int rev =0;
        while (num>0){
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        System.out.println("The reverse of the given integer is "+rev);

    }
}
//Write a program to check if a string is a valid email address.
class ValidEmail{
    public static void validEmail(String email){

        String regrex ="^([a-zA-Z0-9.-]+)@([a-zA-Z0-9-]+).([a-z]{2,8})(.[a-z]{2,8})?$";

        if (email.matches(regrex))
            System.out.println("The given string is a valid e-mail");
        else
            System.out.println("The given string is not a valid e-mail");

    }
}
// Write a program to find the factorial of a number using recursion.
class FactorialUsingRecurssion{
    public static int factorial(int num){
        if (num==0)
            return 1;
        else
            return num*factorial(num-1);
    }
}

//Write a program to find the sum of all elements in an array.
class SumOfArrays{
    public static void sumOfArrays(int[] arr){

        int sum=0;
        for (int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
//Write a program to find the average of all elements in an array.
class AverageOfArrays{
    public static void averageOfArrays(int[] arr){
        int sum=0;
        int avg= arr.length;;
        for (int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        double ans=sum/avg;
        System.out.println(ans);
    }
}
//Write a program to convert a decimal number to binary.
class DecimalToBinary{
    public static void decimalToBinary(int num){

        int[] decimalvalue=new int[100];
        int i=0;
        while (num!=0){
            decimalvalue[i] = num%2;
            num=num/2;
            i++;
        }
        for (int j=i-1;j>=0;j--){
            System.out.print(decimalvalue[j]+" ");
        }
    }
}
//Write a program to find the number of words in a string.
class WordsInAString{
    public static void wordsInAString(String str){

        try {

            int count=0;
            if (str.charAt(0)!=' ')
                count++;
            for (int i=0; i<str.length(); i++){
                if (str.charAt(i)==' '&&str.charAt(i+1)!=' ') {
                    count++;
                }
            }
            System.out.println("The total number of words in an String is "+count);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Plesae enter a string");
        }
    }
}
//Write a program to find the length of the longest increasing subsequence in an array.
class LIS{
    public static void lIS(int[] arr){

        if (arr.length==0)
            System.out.println("The length of the longest increasing array is 0");

        int length=1;
        int maxLength=1;

        for (int i=0;i< arr.length-1;i++){
            if (arr[i+1]>arr[i]) {
                length++;
            }
            else {
                length = 1;
            }
            maxLength=Math.max(length,maxLength);
        }
        System.out.println("The length of the longest increasing array is "+maxLength);

    }
}
//Write a program to find the missing number in an array of consecutive numbers.
class MissingNumber{
    public static void missingNumber(int[] arr){
        int n= arr.length+1;
        int sum=(n*(n+1))/2;

        for (int i=0;i< arr.length;i++){
            sum=sum-arr[i];
        }
        System.out.println("the missing number in an array is "+sum);
    }
}
//Write a program to check if a number is a perfect square.
class PerfectSquare{
    public static void perfectSquare(int num){
        int newnum=0;
        for (int i=1; i<num;i++){
            if (i*i==num) {
                newnum = i;
                System.out.println("The given number is a square of " + i);
            }
        }
        if (newnum==0)
            System.out.println("The given number is not a perfect square");
    }
}
//Write a program to find the largest prime factor of a number.
class PrimeFactor{
    public static void primeFactor(int number){
        Set<Integer> primenum= new HashSet<>();

        for (int i=2;i<=number;i++){
            while (number%i==0){
                primenum.add(i);
                number=number/i;
            }
        }

        int larprime =0;
        for (Integer p: primenum){
            larprime=Math.max(p,larprime);
        }

        System.out.println("The largest prime factor of a number is "+larprime);
    }
}
//Write a program to find the sum of all even numbers in an array.
class SumOfEven{
    public static void sumOfEven(int[] arr){
        int sum =0;

        for (int i=0;i< arr.length; i++){
            if (arr[i]%2==0)
                sum+=arr[i];
        }
        System.out.println("The sum of all even number in an array is "+sum);
    }
}
class SumOfOdd{
    public static void sumOfOdd(int[] arr){
        int sum =0;

        for (int i=0;i< arr.length; i++){
            if (arr[i]%2!=0)
                sum+=arr[i];
        }
        System.out.println("The sum of all odd number in an array is "+sum);
    }
}
//Write a program to check if a string is a valid palindrome using recursion.
class PalindromeRecursion{

    public static void palindromeRecursion(String str){
        int start=0;
        int end = str.length()-1;
//        palindromeRecursion(str,start,end);

        if (palindromeRecursion(str,start,end)==1)
            System.out.println("The given string is a palindrome");
        if (palindromeRecursion(str,start,end)!=1)
            System.out.println("The given string is not a palindrome");
    }

    private static int palindromeRecursion(String str, int start, int end) {

        if (start>=end)
            return 1;

        if (str.charAt(start)!=str.charAt(end))
            return 0;

        return palindromeRecursion(str,start+1,end-1);
    }
}
//Write a program to reverse the words in a sentence.

class ReverseTheWords{


    public static void reverseTheWord(String str){
        String rev="";
        String[] s= str.split(" ");

        for (int i=s.length-1;i>=0;i--){
            rev = rev + s[i] + " ";
        }
        System.out.println(rev);
    }
}
//Write a program to find the sum of all digits in a number.
class SumOfDigits{
    public static void sumOsDigits(int num){

        int rem=0;
        int sum=0;

        while (num!=0){
            rem=num%10;
            sum+=rem;
            num=num/10;
        }
        System.out.println("The sum of all digits in a number is "+sum);
    }
}
//37 Write a program to find the number of vowels and consonants in a string.
class VowelsAndConsonants{
    public static void vowelsAndConsonants(String str){

        int vowels =0;
        int consonants = 0;

       str=str.toLowerCase();

        for (int i=0;i<str.length();i++){

            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o'  || str.charAt(i)=='u' )
                vowels++;

            else if (str.charAt(i)==' ')
                continue;

            else
                consonants++;
        }
        System.out.println("The number of vowels in a string are "+vowels);
        System.out.println("The number of consonants in a string are "+consonants);
    }
}
//Write a program to check if a string is a valid IPv4 address.
class IPv4{
    public static void ipv4(String ipaddress){

        String regrex = "((2[0-5]{2}|[01]?\\d{1,2})\\.){3}(2[0-5]{2}|[01]?\\d{1,2})";

        if (ipaddress.matches(regrex))
            System.out.println("It is a valid ip address");
        else
            System.out.println("It is not a valid ip address");

    }
}
//Write a program to find the number of occurrences of a word in a string.
class OccurenceOfWords{
    public static void occurenceOfWords(String str){
        str=str.toLowerCase();

        Map<String,Integer> oow = new TreeMap<>();

        String[] s = str.split(" ");
        int count =0;

        for (int i=0; i<s.length;i++){
            count=0;
            for (int j=0;j<s.length;j++){
                if (s[i].equals(s[j]))
                    count++;
            }
            oow.put(s[i],count);
        }

        for (Map.Entry<String,Integer> o : oow.entrySet()){
            System.out.println(o.getKey() + " Appeared " + o.getValue() + " Times");
        }
    }

    public static void occurenceOfWords(String str, String word){
        String[] s = str.split(" ");
        int count =0;
        for (int j=0;j<s.length;j++){
            if (s[j].equals(word))
                count++;
        }
        System.out.println("The occurence of the word " + word + " is "+ count +" times");
    }
}
//Write a program to find the largest and smallest prime numbers in a given range.
class LargestSmallestPrime {
    public static void largestSmallestPrime( int min, int max){

        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        boolean prime = true;

        for (int i =min; i<=max;i++){

            for (int j=2;j<i;j++){
                if (i%j==0){
                    prime=false;
                }
            }
            if (prime){
                large=Math.max(i,large);
                small=Math.min(i,small);
            }
            prime=true;
        }
        System.out.println("The smallest prime number in a given range is "+small);
        System.out.println("The largest prime number in a given range is "+large);
    }
}
//41 Write a program to find the number of prime numbers within a given range.
class PrimeWithinRange{
      public static void primeWithinRange(int min , int max){
          Set<Integer> numbers = new TreeSet<>();
          boolean prime = true;

          for (int i =min; i<=max;i++){

              for (int j=2;j<i;j++){
                  if (i%j==0){
                      prime=false;
                  }
              }
              if (prime){
                  numbers.add(i);
              }
              prime=true;
          }
          System.out.println("The number of prime number within a range are ");
          for (Integer n : numbers){
              System.out.print(n + " ");
          }
      }
}
//42 Write a program to find the first non-repeated character in a string.
class FirstNonRepeated {
    public static void firstNonRepeated(String str){
        str=str.toLowerCase();
        int count = 0;
        Map<Character,Integer> ch = new HashMap<>();

        for (int i = 0 ; i< str.length() ; i++){
            count=0;
            for (int j = 0 ; j< str.length() ; j++){
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            ch.put(str.charAt(i),count);
        }
        int check=0;
        for (int k = 0 ; k<str.length();k++){
            if (ch.get(str.charAt(k))==1)
            {
                System.out.println("The first non repeated character in a string is "+str.charAt(k));
                check++;
                break;
            }
        }
        if (check==0){
            System.out.println("The character in the string are all repeated");
        }

    }
}
//43 Write a program to find the maximum product of two integers in an array.
class MaximumProduct{
    public static void maximumProduct(int[] arr){

        int maxproduct =Integer.MIN_VALUE;
        int product = 0;

        for (int i =0; i< arr.length;i++)
        {
            for (int j =0;j<arr.length;j++)
            {
                if (i!=j)
                {
                    product=arr[i]*arr[j];
                    maxproduct=Math.max(maxproduct,product);
                }
            }
        }

        System.out.println("The maximum product of two integers in an array is "+maxproduct);
    }

}
//HackerRank Java Loops II problem solution
class Answer {
    public static void answer(int a, int b ,int n){
        int total=a;
        int v=2;
        for( int i =0;i<n;i++){

            total+=b*Math.pow(v,i);
            System.out.print(total+" ");


        }
        System.out.println(" ");

    }
}
//44 Write a program to find the number of trailing zeros in the factorial of a number.
class TrailingZeros{
    public static void trailingZeros(int num){
        if (num<5)
            System.out.println("The number of zeros in a factorial number is 0");


        else {
            int sum=0;
            while (num>=5){
                sum=sum+num/5;
                num=num/5;
            }
            System.out.println("The number of zeros in a factorial number is "+sum);
        }

    }
}
//45 Write a program to rotate an array to the right by a given number of steps.

class RotateAnArrayRight{
    public static void rotateAnArrayRight(int times, int[] array){
        int temp=0;
        for (int i=0;i<times;i++)
        {
            temp=array[array.length-1];
            for (int j=array.length-1;j>0 ;j--)
            {
                array[j]=array[j-1];
            }
            array[0]=temp;
        }

        for (int a : array)
        {
            System.out.print(a+" ");
        }
    }
}
//46 Write a program to find the maximum sum of a subarray in an array.

class MaximumSumOfSubarray{
    public static void maximumSumOfSubarray(int[] arr)
    {
        int maxsum=arr[0];
        int sum=arr[0];

        for (int i=1;i< arr.length;i++)
        {
           if (sum<0)
               sum=arr[i];
           else {
               sum+=arr[i];
           }
           maxsum=Math.max(sum,maxsum);
        }
        System.out.println("The maximum sum of a sub array in a string is " + maxsum);
    }

    public static void maximumSumOfSubarray1(int[] arr)
    {
        int maxsum=arr[0];
        int sum=arr[0];

        for (int i=1;i< arr.length;i++)
        {
            if (sum>arr[i])
                sum=arr[i];
            else {
                sum+=arr[i];
            }
            maxsum=Math.max(sum,maxsum);
        }
        System.out.println("The maximum sum of a sub array in a string is " + maxsum);
    }
}
//Subarray with given sum
class SubarrayWithSum{
    public static int[] subarrayWithSum(int[] arr, int k){
        int sum=arr[0];

        if (sum==k)
        {
            return new int[]{0};
        }
        else
        {
            for (int i = 0; i<arr.length ; i++)
            {
                sum=arr[i];

                for (int j= i+1; j<arr.length;j++)
                {
                    if (sum==k)
                    {
                        return new int[]{i,j-1};
                    }

                    if (sum>k)
                    {
                        break;
                    }

                    if (sum<k)
                    {
                        sum+=arr[j];
                    }
                }
            }
        }

        return new int[]{-1};
    }
}
//47 Write a program to check if a string is a valid IPv6 address.
//48 Write a program to find the length of the longest common prefix in an array of strings.
class LongestCommonPrefix
{
    public static void longestCommonPrefic(String[] arr)
    {
        if (arr==null || arr.length==0)
            System.out.println("The array is empty");

        if (lcp(arr).equals("-1"))
        {
            System.out.println("There is no common prefic in an array of strings");
        }
        else
        {
            System.out.println(lcp(arr));
        }
    }

    private static String lcp(String[] arr)
    {
        String lcp=arr[0];

        for ( int i=1; i< arr.length;i++)
        {
            String currentWord = arr[i];
            int j=0;

            while (j<lcp.length() && j<currentWord.length() && lcp.charAt(j)==currentWord.charAt(j) )
            {
                j++;
            }
            if (j==0)
                return "-1";

            lcp=currentWord.substring(0,j);
        }
        return lcp;
    }
}
//49 Write a program to find the number of occurrences of each character in a string.

class OCharacterString
{
    public static void oCharacterString (String str)
    {
        Map<Character,Integer> ocs = new TreeMap<>();
        int count =0;

        str=str.toLowerCase();

        for ( int i=0;i<str.length();i++)
        {
            for (int j=0;j<str.length();j++)
            {
                if (str.charAt(i)==str.charAt(j))
                {
                    count++;
                }
            }
            ocs.put(str.charAt(i),count);
            count=0;
        }

        for (Map.Entry<Character,Integer> o : ocs.entrySet())
        {
            System.out.println("The character "+o.getKey() +" occured "+o.getValue()+" times");
        }
    }
}
//50 Write a program to check if a number is a strong number.
class StrongNumber
{
    public static void strongNumber(int num)
    {
        int temp=num;
        int rem=0;
        int sum =0;

        while(num>0)
        {
            rem=num%10;
            sum = sum + factorial(rem);
            num=num/10;
        }

        if (temp==sum)
            System.out.println("The given number is a strong number");
        else
            System.out.println("The given number is not a strong number");
    }

    private static int factorial(int num)
    {
        if (num==0)
            return 1;
        else
            return num*factorial(num-1);
    }
}
//51 Write a program to find the sum of all prime numbers within a given range.

class SumOfPrimeNumbers
{
    public static void sumOfPrimeNumbers(int start, int end)
    {
        int sum=0;
        boolean prime = true;

        for (int i=start ; i<=end ; i++ )
        {
            prime = true;
            if (i==1 || i==0)
                prime=false;

            for (int j=2 ; j<i ;j++)
            {
                if (i%j==0)
                {
                    prime=false;
                    break  ;
                };
            }
            if (prime)
                sum=sum+i;
        }
        if (sum==0)
            System.out.println("There is no prime number between the range");
        else
            System.out.println("The sum of prime number between the range is "+sum);
    }
}
//52 Write a program to check if a number is a perfect cube.
class PerfectCube
{
    //    public static void perfectCube(int num)
//    {
//        boolean cube=false;
//        for ( int i=0; i<num/2;i++)
//        {
//            if (i*i*i==num)
//            {
//                cube=true;
//            }
//        }
//
//        if (cube)
//        {
//            System.out.println("The given number is a perfect cube");
//        }
//        else
//        {
//            System.out.println("The given number is not a perfect cube");
//        }
//    }

    public static void perfectCube(int num)
    {
        double cbrt=Math.cbrt(num);
        double floor=Math.floor(cbrt);

        if (cbrt-floor==0.0)
        {
            System.out.println("The given number is a perfect cube");
        }
        else
        {
            System.out.println("The given number is not a perfect cube");
       }

    }
}
//53 Write a program to find the number of ways to climb a staircase with n steps, where you can either climb 1 or 2 steps at a time.
class Staircase
{
  public static int staircase (int num)
  {
      if (num==0 || num==1)
          return 1;
      return staircase(num-1)+staircase(num-2);
  }

    public static void staircase2(int num)
    {
        int zeroth=1;
        int first =1;
        int sum;

        for (int i =1; i<num+1;i++)
        {
            sum=zeroth+first;//1+1=2   1+2=3    2+3=5   3+5=8    5+8=13
            zeroth=first;//    1       2        3       5        8
            first=sum;//       2       3        5       8        13
        }
        System.out.println(zeroth);
    }
}
//54 Write a program to find the number of prime numbers within a given range using the Sieve of Eratosthenes algorithm.
class PrimeUsingSieve
{
    public static void primeUsingSieve(int num)
    {
        boolean[] compositenum = new boolean[num];

        for (int i=2; i<=(int)Math.sqrt(num); i++)
        {
            if (!compositenum[i])
            {
                for (int j=i;i*j<num;j++)
                {
                    compositenum[i*j]=true;
                }
            }
        }
        for (int k=2;k<num;k++)
        {
            if (!compositenum[k])
                System.out.print(k+" ");
        }
    }
}
//55 Write a program to find the maximum difference between two elements in an array, where the smaller element appears before the larger element.
class MaximumDifferense
{
    public static void maximumDifferns(int[] arr)
    {
        int difference=0;
        int maxDifference=0;

        for (int i=0;i< arr.length;i++)
        {
          for (int j=i+1;j<arr.length;j++)
          {
              if (arr[i]< arr[j])
              {
                  difference=arr[j]-arr[i];
                  maxDifference=Math.max(maxDifference,difference);              }

          }
        }
        System.out.println("The maximum differnce is "+maxDifference);
    }
}
//56 Write a program to find the maximum sum of two non-overlapping subarrays in an array.
//57 Write a program to find the number of palindromic substrings in a string.
//Pattern
class Pattern
{
    public static void pattern(int num)
    {
        int col;
        for ( int i=0;i<2*num-1;i++)
        {
            col =i>=num?2*num-2-i:i;
            for (int j=0;j<=col;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// Pattern2
class Pattern2
{
    public static void pattern2(int num)
    {
        for (int row =1; row<2*num;row++)
        {
            int colinrow = row>num?2*num-row:row;
            int spaces = num-colinrow;

            for (int i=1;i<=spaces;i++)
            {
                System.out.print("  ");
            }
            for ( int col=colinrow; col>=1;col--)
            {
                System.out.print(col+" ");
            }
            for ( int col2=2; col2<=colinrow;col2++)
            {
                System.out.print(col2+" ");
            }
            System.out.println();
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
        //int array[]= {1,1,2,2,3,3,4,4,5,5};
        //int[] array2={2,5};
        //ArrayAscendindOrder.arrayAscendingOrder(array);
        //String[] arr1 = { "Article", "in", "Geeks", "for", "Geeks" };
        //String[] arr2 = { "Geeks", "for", "Geeks" };
        //CommonElements.commonElements(array,array2);
        //String name ="Q Syed Ajmal";
        //OccurrenceOfCharacter.occurrenceOfCharacter(name);
        //Anagram.anagram("ajmal","jamal");
        //MinAndMax.minAndMax(array);
        //RemoveDuplicate.removeDuplicate(array);
        //SecondLargest.secondLargest(array);
        //if (PalindromeNonAlphanumeric.palindromeNonAlphanumeric("malayalam"))
        //    System.out.println("The given string is a palindrome");
        //else
        //    System.out.println("The given string is not a palindrome");
        //PerfectNumber.perfectNumber(28);
        //System.out.println(Power.power(3,4));
        //GCD.gCD(96,132);
        //LCM.lCM(1000,2000);
        //ArmstrongNumber.armstrongNumber(153);
        //ReverseAnInteger.reverseAnInteger(123);
        //Factorial.factorial(5);
        //SumOfArrays.sumOfArrays(array);
        //AverageOfArrays.averageOfArrays(array);
        //WordsInAString.wordsInAString("");
        //ValidEmail.validEmail("@syedajmalq@gmail.com");
        //DecimalToBinary.decimalToBinary(100);
        //int[] arr={2,3,4,5,2,2};
        //LIS.lIS(arr);
        //MissingNumber.missingNumber(arr);
        //PerfectSquare.perfectSquare(26);
        //PrimeFactor.primeFactor(36);
        //SumOfEven.sumOfEven(arr);
        //SumOfOdd.sumOfOdd(arr);
        //PalindromeRecursion.palindromeRecursion("malayalam");
        //ReverseTheWords.reverseTheWord("My Name is Ajmal");
        //SumOfDigits.sumOsDigits(123);
        //VowelsAndConsonants.vowelsAndConsonants("Sumaiya");
        //OccurenceOfWords.occurenceOfWords("Hi ajmal my name is also ajmal","ajmal");
        //IPv4.ipv4("127.0.0.1");
        //LargestSmallestPrime.largestSmallestPrime(1,100);
        //PrimeWithinRange.primeWithinRange(1,100);
        //FirstNonRepeated.firstNonRepeated("aabbccddee");
        //int[] arr = {9,4,7,8,0};
        //MaximumProduct.maximumProduct(arr);
        //Scanner in = new Scanner(System.in);
        //int j = in.nextInt();
        //for( int i =0;i<j;i++){
        //int a = in.nextInt();
        //int b = in.nextInt();
        //int n = in.nextInt();
        //Answer.answer(a,b,n);
        //}
        //TrailingZeros.trailingZeros(0);
        //int[] arr={10,2,4,7,5};
        //RotateAnArrayRight.rotateAnArrayRight(4,arr);
        //MaximumSumOfSubarray.maximumSumOfSubarray(arr);
        //int[] a=SubarrayWithSum.subarrayWithSum(arr,100);
        //for (int b: a)
        //{
        //   System.out.print(b + " ");
        //}
        //String[] arr = { "aaa","aab","bbb"};
        //LongestCommonPrefix.longestCommonPrefic(arr);
        //OCharacterString.oCharacterString("Ajmal");
        //StrongNumber.strongNumber(146);
        //SumOfPrimeNumbers.sumOfPrimeNumbers(4,13);
        //PerfectCube.perfectCube(29791);
        //System.out.println( Staircase.staircase(5));;
        //PrimeUsingSieve.primeUsingSieve(10);
        //int[] arr= {7,9,5,6,13,2};
        //MaximumDifferense.maximumDifferns(arr);
        //Pattern3.pattern3(4);


    }
}