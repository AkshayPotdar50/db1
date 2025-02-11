package com.atos.deproj.sprint2145.design;

public class StringReversal {
    public static void main(String[] args) throws CloneNotSupportedException {
    	
    	printFibonacci(10);

        StringReversal object1=new StringReversal();
        StringReversal object2= (StringReversal) object1.clone();

    }

    public static String reverseString(String str){
        StringBuilder reversed= new StringBuilder();
        for(int i= str.length()-1; i>= 0; i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static String reverseStringSimple(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
    
    public static void printFibonacci(int N) {
    	int num1=0;
    	int num2=1;
    	System.out.print(num1+" "+num2);
    	 
    	int i=2;
    	while(i<=N) {
    		i++;
    		int temp= num1+num2;
    		num1=num2;
    		num2=temp;
    		System.out.print(" "+num2);
    	}
    }


    /*SELECT MAX(salary) AS SecondHighestSalary
FROM Employee
WHERE salary < (SELECT MAX(salary) FROM Employee);
*/




}
