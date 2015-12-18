public class PlusOne {
    public int[] plusOne(int[] digits)
    {
        int carry = 1;
        for(int i = digits.length - 1; i >=0 && carry == 1;i-- )
        {
            digits[i] +=  carry;
            if(digits[i] == 10)
            {
                carry = 1;
                digits[i] = 0;
            }
            else carry = 0;
        }
        
        if(carry == 1)
            {
                int[] num = new int[digits.length + 1];
                num[0] = 1;
                int x = 1;
                while(x < num.length)
                    num[x++]  = 0;
                    
                    return num;
            }
            return digits;
    }
}