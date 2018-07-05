package com.example.demo;

abstract class Employee {
    String id;
    String name;
//    double perDay;
    
    abstract double  calculateSalary();
 
//    double salary;
//    int type; //1, 2, 3, 4, 5, 6 
    
 }



class FullTimeEmployee extends Employee {

    @Override
    double calculateSalary() {
        // TODO Auto-generated method stub
        return 0;
    }
}
class ContractEmployee extends Employee {

    @Override
    double calculateSalary() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
class XXXEmployee extends Employee {
    int workingHour;

    @Override
    double calculateSalary() {
        // TODO Auto-generated method stub
        return 0;
    }
}
//class Report2 implements IRepot {
//    
//}
//class GenerateReport {
//    void generate(IReport report) {
//            report.genHeader();
//            report.GenBody();
//            report.genFooter();
//    }
//}