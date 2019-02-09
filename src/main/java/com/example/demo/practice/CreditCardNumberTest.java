/**
 * 
 */
package com.example.demo.practice;

/**
 * @author kyakambr
 *
 */
public class CreditCardNumberTest {

	
	public static void main(String[] args) {
	
		 String creditCardNumber = "4234567898765432";
         String creditCardIin=creditCardNumber.substring(0,6);
         String lastFourDigits=creditCardNumber.substring(creditCardNumber.length()-4);
         StringBuilder maskedCardNumber= new StringBuilder();
         for(int j=0; j<creditCardNumber.length()-4; j++) {
           maskedCardNumber.append("x");
         }
         maskedCardNumber.append(lastFourDigits);
         
         System.out.println("creditCardIin--"+creditCardIin);
         System.out.println("lastFourDigits--"+lastFourDigits);
         System.out.println("maskedCardNumber--"+maskedCardNumber);

	}

}
