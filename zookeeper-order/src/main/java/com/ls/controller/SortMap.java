package com.ls.controller;

public class SortMap {
	//ֱ�Ӳ�������
	public static void insertSort(int[] a){
		int length=a.length;
		int temp,j;
		for(int i=1;i<length;i++){
			if(a[i]<a[i-1]){
				temp=a[i];
				j=i;
				while(j>0&&a[j-1]>temp){
					a[j]=a[j-1];
					j--;
				}
				a[j]=temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] x = { 6, 2, 4, 1, 5, 9 };
        //insertSort(x);
		insertSort(x);
        for (int i : x) {
			System.out.print(i+",");
        }
		 
	}
	//ϣ������
	public static void sheelSort(int[] a){
		int d = a.length;
		while(d!= 0) {
			d=d/ 2;
			for( int x = 0; x < d; x++) { //�ֵ�����
				System.out.println("d:"+d);
				for( int i = x + d; i < a.length; i += d) { //���е�Ԫ�أ��ӵڶ�������ʼ
					System.out.println("i��"+i);
					int j = i - d; //jΪ�����������һλ��λ��
					System.out.println("j:"+j);
					int temp = a[i]; //Ҫ�����Ԫ��
					System.out.println("temp:"+temp);
					for(; j >= 0&& temp < a[j]; j -= d) { //�Ӻ���ǰ������
						a[j + d] = a[j]; //����ƶ�dλ
					}
					a[j + d] = temp;
				}
			}
		}
	}
	//ð������
	public static void bubbleSort(int[] a){
		int length=a.length;
		int temp;
		for(int i=0;i<length;i++){
			for(int j=0;j<length-i-1;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	//�鲢����
	public static void mergeSort(int[] numbers, int left,int right){
		int t = 1; // ÿ��Ԫ�ظ���
		int size = right - left + 1;
		while(t < size) {
			int s = t; // ����ѭ��ÿ��Ԫ�ظ���
			t = 2* s;
			int i = left;
			while(i + (t - 1) < size) {
				merge(numbers, i, i + (s - 1), i + (t - 1));
				i += t;
			}
			if(i + (s - 1) < right)
				merge(numbers, i, i + (s - 1), right);
			}
		}
		private static void merge(int[] data, int p, int q, int r){
			int[] B = new int[data.length];
			int s = p;
			int t = q + 1;
			int k = p;
			while(s <= q && t <= r) {
				if(data[s] <= data[t]) {
					B[k] = data[s];
					s++;
				} else{
					B[k] = data[t];
					t++;
				}
				k++;
			}
			if(s == q + 1)
				B[k++] = data[t++];
			else
				B[k++] = data[s++];
			for( int i = p; i <= r; i++)
					data[i] = B[i];
		}
}
