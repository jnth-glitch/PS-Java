package com.training;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Account user1 = new Account();
//        System.out.println("User 1 details:\n"+user1);
//        Account user2 = new Account(123,4000,35);
//        System.out.println("User 2 details:\n"+user2);
//        System.out.println("Depositing 1000 in user 2"+ user2.deposit(1000));
//        System.out.println("Withdrawing 100"+user1.withDraw(100));

//        Account[] users = new Account[5];
//        users[0]=new Account(1,1000,35);
//        users[1]=new Account(2,1000,21);
//        users[2]=new Account(3,1000,45);
//        users[3]=new Account(4,1000,63);
//        users[4]=new Account(5,1000,54);
//        int ageSum=0;
//        for(int i=0;i<users.length;i++){
//            System.out.println("User "+(i+1)+" age: "+users[i].getAccountHolderAge());
//            ageSum+=users[i].getAccountHolderAge();
//        }
//        System.out.println("Average Age: "+ ageSum/users.length);
//    }

//    Course[] courses= {
//            new Course("Java", (float) 4.0, 123),
//            new Course("React", (float) 5.0, 124),
//            new Course("Python", (float) 6.0, 125),
//            new Course("C++", (float) 7.0, 126)
//
//    };
//    Scanner sc= new Scanner(System.in);
//
//    System.out.println("Enter the course name to search");
//    String courseName=sc.nextLine();
//    boolean flag= true;
//    for(Course c: courses){
//        if(courseName.equalsIgnoreCase(c.getCourseName())){
//            System.out.println("Course available");
//            flag=false;
//            break;
//        }
//
//    }
//    if(flag){
//        System.out.println("Course unavailable");
//    }


//        Bank iciciBank = new ICICI(10000, 5);
//        Bank sbiBank = new SBI(10000, 5);
//        System.out.println("Principle amount for ICICI :"+iciciBank.getAmount());
//        System.out.println("Maturity amount for ICICI :"+iciciBank.getMaturityAmount());
//        System.out.println("Principle amount for SBI :"+sbiBank.getAmount());
//        System.out.println("Maturity amount for SBI :"+sbiBank.getMaturityAmount());
//
//        SBI sbiBank1 = new SBI(10000, 5);
//        System.out.println(sbiBank1.getRate());

        Employee emp1 = EmployeeFactory.getEmployee("Permanent");
        System.out.println(emp1.getEmpInfo());
    }
}