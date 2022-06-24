package coding.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class OneSwap {
    /*
     * Problem: One Swap 問題，給定ㄧ數組A，判定是否能交換當中的數值一次，就讓數組變為已排序完成的資料。
     * Idea: 將數組先進行排序後比較原始資料與數組內容，若超過兩處數值不一致，則無法只交換一次即達成結果。
	*/
	public static void main(String[] args) {
		System.out.println(isOneSwap(Arrays.asList(1, 2, 8, 4, 9)));
	}

	public static Boolean isOneSwap(List<Integer> src) {
	    List<Integer> sort = new ArrayList<>(src);
		Collections.sort(sort);
	    int diffCount = 0;
	    System.out.println(src);
	    System.out.println(sort);
	    for (int i = 0; i < src.size(); i++) {
	    	System.out.println("src:" + src.get(i));
	    	System.out.println("sort:" + sort.get(i));
	        if (src.get(i) != sort.get(i)) {
	            diffCount++;
	        }
	    }
	    System.out.println(diffCount);
	    return (diffCount <= 2) ? true : false;
	}
	
}