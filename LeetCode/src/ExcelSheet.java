public class ExcelSheet {
    public int titleToNumber(String s)
    {        
        int power = 0,i = s.length()-1;
        int result = 0;
        while(i != -1)
        {
        	result += ((int)s.charAt(i--) - 'A' + 1)*(int)Math.pow(26,power);
        	power++;
        }
        return result;
    }
}