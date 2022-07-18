public class ParanthesisChecker {
  import java.util.Stack;

public class Solution {

    public static boolean isBalanced(String expression) {
        //Your code goes here
        boolean isBalanced=false;
        int openBracketCount,closedBracketCount;
        openBracketCount=closedBracketCount=0;
        if (expression.isEmpty() || (expression.length()%2)!=0) {
            return isBalanced;
        }
        Stack<Character> openBracketStack=new Stack<Character> ();
        for (int i = 0; i < expression.length(); i++) {
            boolean isOpen=CheckIfOpen(expression.charAt(i));
            if (isOpen) {
                openBracketCount++;
                openBracketStack.push(expression.charAt(i));
            }
            else {
                if(i==0)
                return isBalanced;  
                closedBracketCount++;
                if (!openBracketStack.empty()) {
                    char recentOpenChar=openBracketStack.pop();
                    char recentClosedChar=expression.charAt(i);
                    boolean isMatching=IsMatchClosing(recentOpenChar,recentClosedChar);
                    if (!isMatching) {
                        return isBalanced;
                    }
                }
            }
        }
        if (openBracketCount==closedBracketCount) {
            isBalanced=true;
        }	
        return isBalanced;
    }

    private static boolean CheckIfOpen(char str ) {
        boolean ifOpen=false;
        switch (str) {
            case '{': 
                ifOpen=true;
                break;
            case '[': 
                ifOpen=true;
                break;		
            case '(': 
                ifOpen=true;
                break;
            default:
                ifOpen=false;
                break;
        }
        return ifOpen;
    }

    private static boolean IsMatchClosing(char openBracket,char closeBracket) {
        boolean isMatching=false;
        int openASCIIValue=openBracket;
        int closeASCIIValue=closeBracket;
        switch (openBracket) {
            case '{': 
                if ((closeASCIIValue-openASCIIValue)==2) {
                    isMatching=true;
                }
                break;
            case '[': 
                if ((closeASCIIValue-openASCIIValue)==2) {
                    isMatching=true;
                }
                break;
            case '(': 
                if ((closeASCIIValue-openASCIIValue)==1) {
                    isMatching=true;
                }
                break;
        }			
        return isMatching;
    }

}
}
