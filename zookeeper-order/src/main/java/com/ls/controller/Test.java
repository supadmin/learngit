package com.ls.controller;

public class Test {

	public static void main(String[] args) {
	/*	String x = "string";
		String y = "string";
		String z = new String("string");
		System.out.println(x==y); // true
		System.out.println(x==z); // false
		System.out.println(x.equals(y)); // true
		System.out.println(x.equals(z)); // true
*/		
		int[] strs={4,2,5,3,1,6};
		int index=0;
		/*for(int i=0;i<strs.length-1;i++){
			for(int j=0;j<strs.length-1-i;j++){
				if(strs[j]>strs[j+1]){
					index=strs[j];
					strs[j]=strs[j+1];
					strs[j+1]=index;
				}
			}
		}*/
		quickSort(strs,0,strs.length-1);
		for(int i:strs){
			System.out.print(i);
		}
		
	}
	
	// ���η���������
	public static void quickSort(int array[], int low, int high) {// ����low=0��high=array.length-1;
			int pivot, p_pos, i, t;// pivot->λ����;p_pos->��ֵ��
			if (low < high) {
				p_pos = low;
				pivot = array[p_pos];
				System.out.println("pivot: "+pivot);
				for (i = low + 1; i <= high; i++)
					if (array[i] > pivot) {
						p_pos++;
						System.out.println("p_pos: "+p_pos);
						t = array[p_pos];
						System.out.println("t: "+t);
						array[p_pos] = array[i];
						array[i] = t;
					}
				t = array[low];
				array[low] = array[p_pos];
				array[p_pos] = t;
				// �ֶ���֮
				quickSort(array, low, p_pos - 1);// ������벿��
				quickSort(array, p_pos + 1, high);// �����Ұ벿��
			}
		}
}
