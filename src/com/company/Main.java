package com.company;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
import java.util.HashMap;
//import com.sun.javafx.scene.EnteredExitedHandler;

public class Main {

  public static void main(String[] args)
  {

    System.out.println("Select operation:\n"
        + "\t1-Get Median\n"
        + "\t2-Return only primes\n"
        + "\t3-Zero if less than zero\n"
        + "\t4-Get average\n"
        + "\t5-Get the maximum 3 numbers\n"
        + "\t6-Distinct array\n"
        + "\t7-Shift array\n"
        + "\t8-Reverse array\n"
        + "\t9-Count primes\n"
        + "\t10-Check sorted\n"
        + "\t11-Check palindrome\n"
        + "\t12-Find the smallest prime\n"
        + "\t13-Find the largest prime\n"
        + "\t14-Shuffle\n"
        + "\t15-Sort\n"
        + "\t16-Most repeated value\n"
        + "\t17-Get the minimum 3 numbers\n"
        + "\t0-Exit");
while(true)
{
      int Select;
      Scanner one = new Scanner(System.in);
      System.out.print("\n\nYour choice: ");
      Select = one.nextInt();
Vector InputData=new Vector(0);

System.out.print("Enter Data  < separated by 'spaces' >: " );
String input;
Scanner one = new Scanner(System.in);
  input = one.nextLine();


if(Select==1)
{
	Get_Median( InputData,input);
}
else if(select==16) {
	Vector<Integer> mydata=new Vector<Integer>();
	System.out.println("Most repeated value is : " + Most_Repeated_value(mydata,input));

if(Select==1)
{Get_Median( InputData);}
else if(Select==4){
    Get_Avarage(InputData);

}
else if(Select==0)
{
	break;
}

else if(Select==11){
         int array[]=new int[5];
        for(int i=0;i<array.length;i++){
            array[i]=one.nextInt();
        }
        System.out.println(check_palindrom(array));
    
}






}
  }
///////////////////////////////////////////////////

 static String Check_Data_Type( String input)
  {
     String xString1 = null;
     try {
         int ch1 = Integer.parseInt(input);
          xString1="integer";
     } catch (NumberFormatException e) {}
     try {
         float ch2 = Float.parseFloat(input);
          xString1="float";
     } catch (NumberFormatException e) {}
     try {
         String ch3 = String.valueOf(input);
          xString1="String";
     } catch (NumberFormatException e) {}
  return xString1;
  }
   static void Get_Avarage (Vector InputData){
            Scanner in = new Scanner(System.in);
             int sum=0;
            int size;
            System.out.println("Enter the size of the data:");
            size=in.nextInt();
             System.out.println("Enter the numbers to get the avarage:");
             for(int i=0;i<size;i++){
                InputData.add(in.nextInt());
                sum+=(int)InputData.get(i);
             }
              System.out.print("The avarage =" + sum/size);
         }

  static void Get_Median (Vector InputData,String input)
  {
    
      String[] xString=input.split(" ");

      for(int i=0 ; i<xString.length ; i++)
      {
        InputData.add(xString[i]);
      }
      Vector<Integer>yIntegers=new Vector<Integer>(0);
      for(int i=0 ; i<InputData.size() ;i++)
      {
      yIntegers.add(Integer.parseInt((String) InputData.get(i)));
      }
      Collections.sort(InputData);
      Collections.sort(yIntegers);

      System.out.println("The Sorted Data: "+yIntegers);
      int length=InputData.size();

      if (length%2==0) //even
      {
      int idx=(length/2)-1;
      int x1=yIntegers.get(idx);
      int x2=yIntegers.get(idx+1);
      Double sum=(double) (x1+x2);
      System.out.println("The median is: "+sum/2);
      }
      else if(length%2!=0)
      {
        int idx=(length/2);
        int x1=yIntegers.get(idx);

          System.out.println("The median is: "+x1);
      }
  }
///////////////////////
public static boolean is_prime(int n) {
		if(n == 1 ) return false;
		for(int i=2 ; i<n;i++) {
			if(n%i == 0 ) return false;
		}return true;
		
	} 
	public static int smallest_prime(int arr[]) {
		
		ArrayList<Integer> prime_array = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			boolean x = is_prime(arr[i]);
			if(x == true) {
				System.out.println(arr[i]);
			prime_array.add(arr[i]);
			}	
		}
		if(prime_array.size() == 0 ) {prime_array.add(-1);}
		Collections.sort(prime_array);

		return prime_array.get(0);	
	}
	public static void Most_Repeated_value(Vector<Integer>myarr,String input) {
			
		  String[] xString=input.split(" ");
	      for(int i=0 ; i<xString.length ; i++)
	      {
	        myarr.add(Integer.parseInt(xString[i]));
	      }
		// Insert all elements in hash map 
        Map<Integer, Integer> hp = 
               new HashMap<Integer, Integer>(); 
        for(int i = 0; i < myarr.size() i++) 
        { 
            int key = myarr.get(i); 
            if(hp.containsKey(key)) 
            { 
                int freq = hp.get(key); 
                freq++; 
                hp.put(key, freq); 
            } 
            else
            { 
                hp.put(key, 1); 
            } 
        } 
        // find max frequency. 
        int max_count = 0, res = -1;   
        for(Entry<Integer, Integer> val : hp.entrySet()) 
        { 
            if (max_count < val.getValue()) 
            { 
                res = val.getKey(); 
                max_count = val.getValue(); 
            } 
        } 
        return res; //most repeated value
    } 		
		return prime_array.get(0);
	}

       public static boolean check_palindrom(int arr[]){
        boolean t=false;
        int arr2[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[arr.length-(1+i)]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr2[i])
                t=false;
            else 
                t=true;
            
                
        }
        return t;
        
    }
    
    

}
///////////////////////////
public static int minimum_three_numbers(int a , int b , int c )
{
	int smallest;
	if (a <= b && a <= c) {
	    smallest = a;
	} else if (b <= c && b <= a) {
	    smallest = b;
	} else {
	    smallest = c;
	}
	return smallest ;
}



public static int[] sort(int[] input){
	
	// SORT THE INPUT ARRAY ASCENDINGLY
	int len = input.length;
	for (int i = 0 ; i < len-1 ; i++)
		for (int j = i + 1; j < len  ; j++)
			if (input[i] > input[j]){
				int temp = input[j];
				input[j] = input[i];
				input[i] = temp;
			}
	return input; 

}
/////////////////////////////////////////////