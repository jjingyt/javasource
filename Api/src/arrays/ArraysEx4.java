package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysEx4 {
	public static void main(String[] args) {
		//asList() : List�� ũ�⸦ ������ �� ����
		List<String> list=Arrays.asList("apple","���","lemon");
		//list.add("����"); // UnsupportedOperationException
		System.out.println(list); 
		
		
		List<String> list1 = new ArrayList<String>();
		list1.add("apple");
		list1.add("���");
		list1.add("lemon");
		
		
		List<Integer> list2=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		list2.add(6);
		System.out.println(list2);
		
	}
}













