/*65. Valid Number My Submissions QuestionEditorial Solution Total Accepted: 43959 Total Submissions: 365437 Difficulty: Hard
Validate if a given string is numeric.

Some examples:
"0" => true
" 0.1 " => true
"abc" => false
"1 a" => false
"2e10" => true
Note: It is intended for the problem statement to be ambiguous. You should gather all requirements up front before implementing one.

Update (2015-02-10):
The signature of the C++ function had been updated. If you still see your function signature accepts a const char * argument, please click the reload button  to reset your code definition.

Subscribe to see which companies asked this question
 * 
 */
package hard;

public class Valid_Number {
 public boolean isNumber(String s) {
   if(s==null)  return false;
   s=s.trim();
   if(s.length()==0)  return false;
   boolean dotFlag = false;
   boolean eFlag = false;
   for(int i=0;i<s.length();i++){
	   
	   switch(s.charAt(i)){
	   case '.':
		   if(dotFlag||eFlag||((i==0||!(s.charAt(i-1)>='0'&&s.charAt(i-1)<='9'))
				&&(i==s.length()-1||!(s.charAt(i+1)>='0'&&s.charAt(i+1)<='9'))))
			   return false;
		      dotFlag = true;
		      break;
	   case '+':
	   case '-':
		    if((i>0&&(s.charAt(i-1)!='e'&&s.charAt(i-1)!='E'))
		    	||(i==s.length()-1 || !(s.charAt(i+1)>='0'&&s.charAt(i+1)<='9'
		    	||s.charAt(i+1)=='.')))
		    	return false;
		        break;
	   case 'e':
	   case  'E':
		    if(eFlag || i==s.length()-1 ||i==0)
		    	  return false;
		    eFlag = true;
		    break;
	   case '0':
	   case '1':
	   case '2':
	   case '3':
	   case '4':
	   case '5':
	   case '6':
	   case '7':
	   case '8':
	   case '9':
		    break;
	   default:
		    return false;
	   }
   }
   return true;
   }
 
 //解法二
// public boolean isNumber(String s) {  
//     if(s.trim().isEmpty()){  
//         return false;  
//     }  
//     String regex = "[-+]?(\\d+\\.?|\\.\\d+)\\d*(e[-+]?\\d+)?";  
//     if(s.trim().matches(regex)){  
//         return true;  
//     }else{  
//         return false;  
//     }  
 }  
}