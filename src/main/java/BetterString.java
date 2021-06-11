/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rady
 */
import java.util.function.BiPredicate;
public class BetterString {
    
	
	public static String betterString(String x, String y, BiPredicate<String, String> t) {
		
		return t.test(x, y) ? x: y ;
		
	}

}

