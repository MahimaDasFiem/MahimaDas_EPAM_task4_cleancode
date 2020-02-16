package mahima.com;

import java.util.*;
import java.io.*;
import java.lang.*;
public class App
{
    public static void main(String args[]) throws IOException
    {
        Interest i = new Interest();
        Construction c = new Construction();
        System.out.println("-----INTEREST-----");
        i.calc_interest();
        System.out.println("-----CONSTRUCTION ESTIMATION-----");
        c.estimation();
    }

}
class Interest
{
	void calc_interest() throws IOException
    {
        double si,ci;
        double principle,rate;
        int time,choice;
        Scanner sc = new Scanner(System.in);
        System.out.write("Enter the principle amount : \n".getBytes());
        principle=sc.nextDouble();
        System.out.write("Enter the rate of interest : \n".getBytes());
        rate=sc.nextDouble();
        System.out.write("Enter the time duration :  \n".getBytes());
        time=sc.nextInt();
        System.out.write("enter your choice : 1 for simple interest or 2 for compound interest : \n".getBytes());
        choice=sc.nextInt();
        if(choice==1)
        {
            si=(principle*rate*time)/100;
            System.out.printf("Simple Interest is : %f \n",si);
        }
        else if(choice == 2)
        {
            ci=principle*Math.pow((1+(rate/100)),time);
            System.out.printf("Compound Interest is : %f \n",ci);
        }
        else
            System.out.write("invalid input : \n".getBytes());
    }

}

class Construction
{
	void estimation() throws IOException
    {
        String standard,automation ;
        double area,estimate;
        
        String type1="standard material",type2="above standard material",type3="highly standard material",automation1="no",automation2="yes";
        Scanner sc = new Scanner (System.in);
        System.out.write("enter the material of the house : \n".getBytes());
        standard = sc.nextLine();
        System.out.write("enter whether the house is fully automated : \n".getBytes());
        automation=sc.nextLine();
        System.out.write("enter the area of the house : \n".getBytes());
        area=sc.nextDouble();
        if(standard.compareTo(type1)==0 && automation.compareTo(automation1)==0)
        {
            estimate=area*1200;
            System.out.printf("The estimated cost is : %f \n",estimate);
        }
        else if(standard.compareTo(type2)==0 && automation.compareTo(automation1)==0)
        {
            estimate=area*1500;
            System.out.printf("The estimated cost is : %f \n",estimate);
        }
        else if(standard.compareTo(type3)==0 && automation.compareTo(automation1)==0)
        {
            estimate=area*1800;
            System.out.printf("The estimated cost is : %f \n",estimate);
        }
        else if(standard.compareTo(type3)==0 && automation.compareTo(automation2)==0)
        {
            estimate=area*2500;
            System.out.printf("The estimated cost is : %f \n",estimate);
        }
        else
            {
                System.out.printf("wrong input : ");
            }
    }

}
