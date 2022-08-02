package datastructures;

public class Lis {

	static int incre_subseq(int my_arr[], int arrlen){
	      int seq_arr[] = new int[arrlen];
	      int i, j, max = 0;
	      for (i = 0; i < arrlen; i++)
	         seq_arr[i] = 1;
	      for (i = 1; i < arrlen; i++)
	      for (j = 0; j < i; j++)
	      if (my_arr[i] > my_arr[j] && seq_arr[i] < seq_arr[j] + 1)
	      seq_arr[i] = seq_arr[j] + 1;
	      for (i = 0; i < arrlen; i++)
	      if (max < seq_arr[i])
	      max = seq_arr[i];
	      return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int my_arr[] = {12,14,4,2,9,3};
	      int arrlen = my_arr.length;
	      System.out.println("The length of the longest increasing subsequence is " +  incre_subseq(my_arr, arrlen));

	}

}
