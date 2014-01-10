package com.thoughtworks.generics.wildcards;

public class Demo {
    public static void main(String[] args) {
        MyEmployeeUtil<CompanyAEmp> empA = new MyEmployeeUtil<CompanyAEmp>(new CompanyAEmp("Ram", 20000));
        MyEmployeeUtil<CompanyBEmp> empB = new MyEmployeeUtil<CompanyBEmp>(new CompanyBEmp("Krish", 30000));
        MyEmployeeUtil<CompanyAEmp> empC = new MyEmployeeUtil<CompanyAEmp>(new CompanyAEmp("Nagesh", 20000));
        System.out.println("Is salary same? "+empA.isSalaryEqual(empB));
        System.out.println("Is salary same? "+empA.isSalaryEqual(empC));
    }
}