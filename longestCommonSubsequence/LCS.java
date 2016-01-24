package longestCommonSubsequence;

public class LCS {

	public static void main(String[] args)
	{
		String str1 = "abcdaf";
		String str2 = "acbcf";
		
		int l = getLcsLength(str1.toCharArray(),str2.toCharArray());
		System.out.println("\nlength of LCS - " + l);
	}
	
	public static int getLcsLength(char str1[],char str2[])
	{
		int[][] mat = new int[str1.length+1][str2.length+1];
		int max = 0;
		System.out.print("Longest common subsequence is : ");
//		System.out.println(mat.length);
		for(int i=1;i<mat.length;i++)
		{
			for(int j=1;j<mat[i].length;j++)
			{
				if(str1[i-1] == str2[j-1])
					{
					
					mat[i][j] = mat[i-1][j-1] + 1;
					}
				else
					mat[i][j] = Math.max(mat[i][j-1], mat[i-1][j]);
				if(mat[i][j]>max)
					{
					max = mat[i][j];
					System.out.print(str1[i-1]);
					}
			}
		}
		return max;
		
	}
}
