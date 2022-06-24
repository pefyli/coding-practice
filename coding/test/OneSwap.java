package coding.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class OneSwap {
    /*
     * Problem: One Swap ���D�A���w���Ʋ�A�A�P�w�O�_��洫�����ƭȤ@���A�N���Ʋ��ܬ��w�Ƨǧ�������ơC
     * Idea: �N�Ʋե��i��Ƨǫ�����l��ƻP�Ʋդ��e�A�Y�W�L��B�ƭȤ��@�P�A�h�L�k�u�洫�@���Y�F�����G�C
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