package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

import java.util.HashMap;
//import com.sun.javafx.scene.EnteredExitedHandler;

public class Main {


	public static void main(String[] args)
	{
		System.out.println("Select operation:\n"
				+ "\t1-Get Median\n"                                     //Done
				+ "\t2-Return only primes\n"                             //Done
				+ "\t3-Zero if less than zero\n"                         //Done
				+ "\t4-Get average\n"                                    //Done
				+ "\t5-Get the maximum 3 numbers\n"                      //Done
				+ "\t6-Distinct array\n"                                 //Done
				+ "\t7-Shift array\n"                                    //Done
				+ "\t8-Reverse array\n"                                  //Done  
				+ "\t9-Count primes\n"                                   //Done 
				+ "\t10-Check sorted\n"                                  //Done
				+ "\t11-Check palindrome\n"                              //Done
				+ "\t12-Find the smallest prime\n"                       //Done
				+ "\t13-Find the largest prime\n"                        //Done
				+ "\t14-Shuffle\n"                                       //Done
				+ "\t15-Sort\n"                                          //Done
				+ "\t16-Most repeated value\n"                           //Done
				+ "\t17-Get the minimum 3 numbers\n"                     //Done
				+ "\t18-Execute all\n"
				+ "\t0-Exit");
		while(true) {
			
			int Select;
			Scanner one = new Scanner(System.in);
			System.out.print("\n\nYour choice: ");
			Select = one.nextInt();
			
			 if(Select==0)
				{
					break;
				}

			Vector InputData=new Vector(0);

getData(InputData);

			if(Select==1)
			{
				Get_Median( InputData);
			}
			if(Select==2)
			{
				Print_only_prime(InputData);
			}
			if(Select==4)
			{
				Get_AVG(InputData);
			}
			if(Select==6)
			{
				Distinict_Array(InputData);
			}
			if(Select==12)
			{
				smallest_prime(InputData);
			}
			if(Select==13)
			{
				Largest_prime(InputData);
			}
			if(Select==16)
			{
				Most_Repeated_value(InputData);
			}
			if(Select==10)
			{
				check_sorted(InputData);
			}
			if(Select==9)
			{
				Count_Primes(InputData);
			}
			if(Select==8)
			{
				Reverse_Arry(InputData);
			}
			if(Select==17)
			{
				minimum_three_numbers(InputData);
			}
			if(Select==5)
			{
				maximum_three_numbers(InputData);
			}
			if(Select==7)
			{
				Shift_array(InputData);
			}
			if(Select==3)
			{
				Zero_If_lessThan_Zero(InputData);
			}

			if(Select==15)
			{
				Sort_Array(InputData);
			}
			if(Select==14)
			{
				Suffle_Array(InputData);
			}
			if(Select==11)
			{
				Check_Palindrom(InputData);
			}

			if(Select==18)
			{
				Get_AVG(InputData);
				System.out.println("\n");
				
				Get_Median( InputData);
				System.out.println("\n");

				Suffle_Array(InputData);
				System.out.println("\n");

				Check_Palindrom(InputData);
				System.out.println("\n");

				check_sorted(InputData);
				System.out.println("\n");

				Most_Repeated_value(InputData);
				System.out.println("\n");

				Print_only_prime(InputData);
				System.out.println("\n");

				Count_Primes(InputData);
				System.out.println("\n");

				Largest_prime(InputData);
				System.out.println("\n");

				smallest_prime(InputData);
				System.out.println("\n");

				Zero_If_lessThan_Zero(InputData);
				System.out.println("\n");

				maximum_three_numbers(InputData);
				System.out.println("\n");

				minimum_three_numbers(InputData);
				System.out.println("\n");

				Reverse_Arry(InputData);
				System.out.println("\n");

				Distinict_Array(InputData);
				System.out.println("\n");
				
				Shift_array(InputData);
				System.out.println("\n");


			}
			

		}
	}

	


    static void getData(  Vector<String> data )
    {
        System.out.print("Enter Data (Integer)  < separated by 'spaces' >: " );
        String input;
        Scanner one = new Scanner(System.in);
        input = one.nextLine();
        String[] xString=input.split(" ");

        for(int i=0 ; i<xString.length ; i++)
        {
        	data.add(xString[i]);
        }

    }


    static Vector<Integer> convertToInt(Vector<String> vector)
    {
        Vector<Integer>yIntegers=new Vector<Integer>();
        for(int i=0 ; i<vector.size() ;i++)
        {
            yIntegers.add(Integer.parseInt((String)vector.get(i)));
        }
        return  yIntegers;
	}



	static void Get_Median (Vector<String> ss)
	{
		
		Vector<Integer> yIntegers=convertToInt(ss);
		
		
		Collections.sort(yIntegers);
		System.out.println("The Sorted Data: "+yIntegers);
		int length=yIntegers.size();

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
	public static boolean is_prime(int n) 
	{

		if(n == 1 ) return false;
		for(int i=2 ; i<n;i++) 
		{
			if(n%i == 0 ) return false;
		}
		return true;
	}
	
	public static void Print_only_prime(Vector<String> ss) 
	{
		Vector<Integer> yIntegers=convertToInt(ss);
		System.out.print("The prime numbers is: ");
for(int i=0 ; i<ss.size() ; i++)
{
	
	boolean flag =is_prime(yIntegers.get(i));
	if(flag==true)
	{
	System.out.print(yIntegers.get(i)+" ");	
	}
	
}	
	}
	
	public static void smallest_prime(Vector<String> ss) 
	{
		Vector<Integer> yIntegers=convertToInt(ss);
		Vector<Integer> ex =new Vector<Integer>(0)  ;
for(int i=0 ; i<ss.size() ; i++)
{
	boolean flag =is_prime(yIntegers.get(i));
	if(flag==true)
	{
//	System.out.print(yIntegers.get(i)+" ");	
	ex.add(yIntegers.get(i));
	
	}	
	}
Collections.sort(ex);
//System.out.println(ex);
System.out.println("The smallest prime is: "+ex.get(0));
}
	public static void Largest_prime(Vector<String> ss) 
	{
		Vector<Integer> yIntegers=convertToInt(ss);
		Vector<Integer> ex =new Vector<Integer>(0)  ;
for(int i=0 ; i<ss.size() ; i++)
{
	boolean flag =is_prime(yIntegers.get(i));
	if(flag==true)
	{
//	System.out.print(yIntegers.get(i)+" ");	
	ex.add(yIntegers.get(i));
	
	}	
	}
Collections.sort(ex);
//System.out.println(ex);
System.out.println("The largest prime is: "+ex.get(ex.size()-1));
}
	
	public static void Most_Repeated_value(Vector<String>ss) 
	{
		int Counter= 0;
		Vector<String>not_Repeated = new Vector<String>(0);
		Vector<Integer>freq = new Vector<Integer>(0);
		for(int i=0 ; i<ss.size() ; i++)
		{
			
			if (not_Repeated.contains(ss.get(i))){continue;}
			not_Repeated.add(ss.get(i));
		}
		
		for(int i=0 ; i<not_Repeated.size() ; i++)
		{
		    for (int j = 0; j < ss.size(); j++) 
		        {
		    	        if(not_Repeated.get(i).equals(ss.get(j)))  {Counter++;}
		        }
		   freq.add(Counter);
	        Counter=0;
		}
		int max = Collections.max(freq);
 int idx=0;
		for(int i=0 ; i<freq.size() ; i++)
		{
			idx=freq.indexOf(max);
			//freq.contains(max);
		}
		System.out.println("The most repeated value is: "+not_Repeated.get(idx));
			
	}
	
	public static void check_sorted(Vector<String>ss) 
	{
		System.out.print("\nCheck sorted: ");
		Vector<Integer> yIntegers=convertToInt(ss);
		Vector<Integer> sorted = new Vector<Integer>(0);
		
		for(int i=0 ; i<yIntegers.size() ; i++)
		{
			sorted.add(yIntegers.get(i));
		}
		Collections.sort(sorted);
		boolean flag =true;
		for (int i = 0; i < sorted.size(); i++) 
		{
			if(yIntegers.get(i).equals(sorted.get(i)) )
			{
				continue;
			}
			else
			{
				flag=false;
				break;
			}
			
		}
		System.out.println(flag);
		
	}

	public static void minimum_three_numbers(Vector<String>ss) 
	{
		Vector<Integer> yIntegers=convertToInt(ss);
		Collections.sort(yIntegers);
		System.out.print("The minimum three numbers is: ");
		for(int i =0 ; i<3 ; i++)
		{
			System.out.print(yIntegers.get(i)+ " ");
		}

		
	}
	public static void maximum_three_numbers(Vector<String>ss) 
	{
		Vector<Integer> yIntegers=convertToInt(ss);
		Collections.sort(yIntegers);
		System.out.print("The maximum three numbers is: ");
		for(int i =yIntegers.size()-1 ; i>yIntegers.size()-4 ; i--)
		{
			System.out.print(yIntegers.get(i)+ " ");
		}

		
	}
	
	public static void Shift_array(Vector<String>ss) 
	{
		
		String Temp="";
        Temp  += ss.elementAt(0);
        ss.remove(0);
        ss.add(Temp);
        System.out.print("The shifted array is: ");
        for(int i = 0 ; i < ss.size();i++)
        {
            System.out.print(ss.elementAt(i) );
        }
	}
	
	public static void Zero_If_lessThan_Zero(Vector<String>ss) 
	{
		
		System.out.print("Check Zero_If_less_Than_Zero:  ");
		Vector<Integer> yIntegers=convertToInt(ss);
		
		for (int i = 0; i < yIntegers.size(); i++) 
		{
			if(yIntegers.get(i)<0)
			{
				yIntegers.remove(i);
				yIntegers.add(i, 0);
			}	
		}
		
		for(int i=0 ; i<ss.size() ; i++)
			{
				System.out.print(yIntegers.get(i)+" ");
			}
		

		
	}
	
	public static void Sort_Array(Vector<String>ss) 
	{
		Vector<Integer> yIntegers=convertToInt(ss);
		Collections.sort(yIntegers);
		System.out.print("The sorted array is: ");
		for(int i=0 ; i<yIntegers.size() ; i++)
		{
			System.out.print(yIntegers.get(i)+" ");
		}

	}
	public static void Suffle_Array(Vector<String>ss)
	{
		Vector<Integer> yIntegers=convertToInt(ss);
		Collections.shuffle(yIntegers);
		System.out.print("The suffled array is: ");
		for(int i=0 ; i<ss.size() ; i++)
		{
			System.out.print(yIntegers.get(i)+" ");
		}
	}
	
	public static void Count_Primes(Vector<String>ss)
	{
		Vector<Integer> yIntegers=convertToInt(ss);
		Vector<Integer> count =new Vector<Integer>(0)  ;
for(int i=0 ; i<ss.size() ; i++)
    {
	   boolean flag =is_prime(yIntegers.get(i));
	   if(flag==true)
	   {
	     	count.add(yIntegers.get(i));
	   }
		
	}
System.out.println("The number of primes number is: "+count.size());
	}
	
	public static void Get_AVG(Vector<String>ss)
	{
		Vector<Integer> yIntegers=convertToInt(ss);
		double sum=0;
		for(int i =0 ; i<yIntegers.size() ; i++)
		{
			sum+=yIntegers.get(i);
		}
		
		double avg = sum / yIntegers.size();
		System.out.println("The Average of the numbers is: "+ avg);
		
	}
	
	public static void Distinict_Array(Vector<String>ss) 
	{
		int Counter= 0;
		Vector<String>not_Repeated = new Vector<String>(0);
		Vector<Integer>freq = new Vector<Integer>(0);
		for(int i=0 ; i<ss.size() ; i++)
		{
			
			if (not_Repeated.contains(ss.get(i))){continue;}
			not_Repeated.add(ss.get(i));
		}
		System.out.print("The Distinict array is: ");
		for(int i=0 ; i<not_Repeated.size() ; i++)
		{
			System.out.print(not_Repeated.get(i)+" ");
		}
	
	}
	
	public static void Reverse_Arry(Vector<String>ss)
	{
		Collections.reverse(ss);
System.out.print("The reversed array is: ");
for(int i=0 ; i<ss.size() ; i++)
{
	System.out.print(ss.get(i)+" ");
}
		
	}
	
	public static void Check_Palindrom(Vector<String>ss)
	{
		System.out.print("\ncheck Palindrom  ");
		boolean flag=true;
		
		Vector<String>Rev=new Vector<String>(0);
		for(int i=0 ; i<ss.size(); i++)
		{
			Rev.add(ss.get(i));
		}
		Collections.reverse(Rev);
		
		for(int i=0 ; i<ss.size() ; i++)
		{
			if (ss.get(i).equals(Rev.get(i)))
			{
				continue;
			}
			else {
				flag=false;
				break;
			}
		}
		System.out.println(flag);
		
		
	}

}
