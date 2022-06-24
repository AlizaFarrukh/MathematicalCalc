class Solution {
	public String solution(int A, int B) {// Java implementation of the approach

		String rt = "";
		while (0 < A || 0 < B)
		{

			// More 'b', append "bba"
			if (A < B)
			{
				if (0 < B--)
				{
					rt += ('b');
				}
				if (0 < B--)
				{
					rt += ('b');
				}
				if (0 < A--)
				{
					rt += ('a');
				}
			}

			// More 'a', append "aab"
			else if (B < A)
			{
				if (0 < A--)
				{
					rt += ('a');
				}
				if (0 < A--)
				{
					rt += ('a');
				}
				if (0 < B--)
				{
					rt += ('b');
				}
			}

			// Equal number of 'a' and 'b'
			// append "ab"
			else
			{
				if (0 < A--)
				{
					rt += ('a');
				}
				if (0 < B--)
				{
					rt += ('b');
				}
			}
		}
		return rt;			
	}

			// Driver code
			
		

		// This code is contributed
		// by PrinciRaj1992

	public static void main(String[] args) {
		Solution sol = new Solution();
		String ans = sol.solution(11,25);
		System.out.println(ans);
	}
}