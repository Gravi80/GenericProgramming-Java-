package com.thoughtworks.generics.wildcards;

public class MyEmployeeUtil<T extends Employee> {
    private T emp;

    public MyEmployeeUtil(T obj){
        emp = obj;
    }

    public int getSalary(){
        return emp.getSalary();
    }

//    public boolean isSalaryEqual(MyEmployeeUtil<T> otherEmp){
//
//        if(emp.getSalary() == otherEmp.getSalary()){
//            return true;
//        }
//        return false;
//    }



    public boolean isSalaryEqual(MyEmployeeUtil<?> otherEmp){

        if(emp.getSalary() == otherEmp.getSalary()){
            return true;
        }
        return false;
    }
}