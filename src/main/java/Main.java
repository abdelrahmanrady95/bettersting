/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rady
 */
public class Main {

    
    public static void main(String args[]) {
        String str1 = "First String";
		String str2 = "Second String";
		
		String longer = BetterString.betterString(str1, str2, (s1,s2) -> s1.length() > s2.length());
		String first = BetterString.betterString(str1, str2, (s1,s2) -> true);
		
		System.out.println(longer);
		System.out.println(first);
    }
}
