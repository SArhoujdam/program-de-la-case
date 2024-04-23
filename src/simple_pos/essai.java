/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simple_pos;

import java.text.DecimalFormat;

/**
 *
 * @author soulayman
 */
public class essai {
    
    static String doubleFormat2(double d){
          DecimalFormat df=new DecimalFormat("#.##");
 System.out.println("Double upto 2 decimal places: "+df.format(d));
return df.format(d);
    }
    
    
    public static void main(String[] args) {
     
//        double d = 2.456534;
//        System.out.println( doubleFormat2(d));
         
DecimalFormat df=new DecimalFormat("#.##");
 
double d = 2.456534;
System.out.println("Double upto 2 decimal places: "+df.format(d));
String a= df.format(d);
String b=a.replace(',', '.');
        System.out.println("======"+b);


    }
    
    
}
