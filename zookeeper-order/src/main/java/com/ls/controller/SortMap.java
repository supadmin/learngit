package com.ls.controller;

public class SortMap {
	//直接插入排序
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
	//希尔排序
	public static void sheelSort(int[] a){
		int d = a.length;
		while(d!= 0) {
			d=d/ 2;
			for( int x = 0; x < d; x++) { //分的组数
				System.out.println("d:"+d);
				for( int i = x + d; i < a.length; i += d) { //组中的元素，从第二个数开始
					System.out.println("i："+i);
					int j = i - d; //j为有序序列最后一位的位数
					System.out.println("j:"+j);
					int temp = a[i]; //要插入的元素
					System.out.println("temp:"+temp);
					for(; j >= 0&& temp < a[j]; j -= d) { //从后往前遍历。
						a[j + d] = a[j]; //向后移动d位
					}
					a[j + d] = temp;
				}
			}
		}
	}
	//冒泡排序
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
	//归并排序
	public static void mergeSort(int[] numbers, int left,int right){
		int t = 1; // 每组元素个数
		int size = right - left + 1;
		while(t < size) {
			int s = t; // 本次循环每组元素个数
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
