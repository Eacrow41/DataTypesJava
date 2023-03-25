package com.mycompany.datatypesjava;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author etc-1
 */
public class DataTypes {
    public static void main(String[] args) {
        //Enteros
        int n = 1234567890; // 4 Bytes
        byte i = 126; //1 Byte
        short e = 32767; // 2 Bytes
        long a = 12345678901L; //8 Bytes
        
        //Punto Flotante
        float v = 3400.0000F; //4 Bytes el elemento no va hacer tan preciso
        double b = 31.0255; //8 Bytes
        
        //Texto
        //char a = '1'; //2 Bytes
      
        //Logico
        //boolean a = true; //2 Bytes
        
        //Java 10
        // var sin especificar el tipo de variable
        
        var salary = 1000;
        var pension = salary * 0.03;
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);
        
        var employeeNmae = "Estiven Cuervo";
        System.out.println("EMPLOYEE: " + employeeNmae + " SALARY: " + totalSalary);
        
    }
}
