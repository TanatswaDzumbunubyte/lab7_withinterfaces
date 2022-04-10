package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {

        BufferedReader tj= new BufferedReader(new InputStreamReader(System.in));
        String SurnameDzumbunu56874,FirstnameAlexandr56874,StreetDzumbunu56874,CityDzumbunu56874;
        int ZipcodeDzumbunu56874;

        void Initialize() throws IOException{
            System.out.println("PLEASE TYPE IN YOUR FIRST NAME- ");
            FirstnameAlexandr56874=tj.readLine();
            System.out.println("PLEASE TYPE IN YOUR SURNAME-");
            SurnameDzumbunu56874= tj.readLine();
            System.out.println("PLEASE TYPE IN STREET NAME-");
            StreetDzumbunu56874= tj.readLine();
            System.out.println("PLEASE TYPE IN A CITY-");
            CityDzumbunu56874=tj.readLine();
            System.out.println("PLEASE TYPE IN A ZIP CODE-");
            ZipcodeDzumbunu56874=Integer.parseInt(tj.readLine());
        }
        void PrintData()
        {
            System.out.println("FIRST NAME-" + FirstnameAlexandr56874);
            System.out.println("SURNAME-"+ SurnameDzumbunu56874);
            System.out.println("STREET-"+StreetDzumbunu56874);
            System.out.println("CITY-"+ CityDzumbunu56874);
            System.out.println("ZIPCODE-"+ZipcodeDzumbunu56874);
        }

    }
    abstract class Staff extends Person implements Salary
    {
        String EducationDzumbunu56874, Position56874;
        void Initialize1() throws IOException {
            Initialize();
            System.out.println("PLEASE ENTER EDUCATION");
            EducationDzumbunu56874 = tj.readLine();
            System.out.println("PLEASE ENTER POSITION");
            Position56874 = tj.readLine();

        }
        void Print1(){
            PrintData();
            System.out.println("EDUCATION: "+EducationDzumbunu56874);
            System.out.println("POSITION: "+Position56874);

    }
}

interface Salary
{
   double salaryToPayDzumbunu56874(double rateDzumbunu56874,double hoursDzumbunu56874);

   default double salaryForOvertime(double overTimeHoursDzumbunu56874, double rateDzumbunu56874)
   {
       double totalDzumbunu56874 = overTimeHoursDzumbunu56874*rateDzumbunu56874;
       return totalDzumbunu56874;
   };

   static double bonusEligibleDzumbunu56874(double yearsOfExperienceDzumbunu56874)
   {
       double bonusDzumbunu56874 = 0;
       if (yearsOfExperienceDzumbunu56874>5) bonusDzumbunu56874=100;
       else bonusDzumbunu56874=0;
       return bonusDzumbunu56874;
   }
}

