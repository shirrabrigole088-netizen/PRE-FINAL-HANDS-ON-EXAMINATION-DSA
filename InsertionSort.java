/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class InsertionSort {
    public static void insetionSort(Student [] students){
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i-1;
            
            while(j>= 0 && students[j].finalGrade < key.finalGrade){
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }
}
