package com.company;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
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
if(Select==1)
{Get_Median( InputData);}
else if(Select==0)
{break;}
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

  static void Get_Median (Vector InputData)
  {
    System.out.print("Enter Data (Integer) to get median < separated by 'spaces' >: " );
    String input;
    Scanner one = new Scanner(System.in);
      input = one.nextLine();
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
/////////////////////////////////////////////
static public void shiftting(Vector<String>Text)
    {
        String Temp="";
        Temp  += Text.elementAt(0);
        Text.remove(0);
        Text.add(Temp);
        System.out.println("Text After Shifting:");
        for(int i = 0 ; i < Text.size();i++)
        {
            System.out.print(Text.elementAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        
    }
///////////////////	//////////////////////////////////////////////////