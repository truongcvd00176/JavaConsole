/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconsole.model;

import java.util.ArrayList;
import java.util.Scanner;
import javaconsole.entity.Student;
/**
 *
 * @author daolinh
 */
public class StudentModel {
    
    private static ArrayList<Student> listStudent;
    
    public  ArrayList<Student> getList(){
        return listStudent;
    }
    
    public void insert(Student student){
        if(listStudent == null){
            listStudent = new ArrayList<Student>();
        }        
        listStudent.add(student);
//        System.out.println("======Danh sách sinh viên======");
//        for (Student student1 : listStudent) {
//            System.out.println(student1.getName());
//        }
//        System.out.println("==============================");
    }
    
    public void update(Student newStudent, int x){
        
        listStudent.set(x-1, newStudent);
    }
    
    public void delete(int x){
        listStudent.remove(x-1);
  
    }
   


}