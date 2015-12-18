package medium;

public class SumNumber2 {
public int singleNumber(int[] nums) {
          
        int index = 0;
        int temp = 1;
        int[] degits = new int[32];

        while( temp != 0 )
        {
            int count = 0;
            for(int x: nums)
                if( (temp & x) == temp )
                    count++;
  
            if(count == 1 || count % 3 == 1) degits[index] = 1;
            else degits[index] = 0;
            	
            index++;
            temp = temp << 1;
        }
        
        index = 1;        
        for(int x: degits){
            temp += x * index;
            index *= 2;
        }
        
        return temp;
    }
}
