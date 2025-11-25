package ImpAlgorithms;
public class LongestCommonSubsequence {
    private static int LCS(String S1,String S2,int m,int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (S1.charAt(i - 1) == S2.charAt(j - 1)) {
                    dp[i][j] = (dp[i - 1][j - 1]) + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String S1="ABC";
        String S2="ACD";

        int m=S1.length();
        int n=S2.length();

        int lcs=LCS(S1,S2,m,n);
        System.out.println("the first string is "+ S1);
        System.out.println("the second string is "+ S2);
        System.out.println("the longest common sequence is "+ lcs);
    }
}













