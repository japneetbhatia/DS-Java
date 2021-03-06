class Solution {
    public static int LCSS(String s1, String s2, int n, int m, int[][] dp) {
        if (n == 0 || m == 0) {
            return dp[n][m] = 0;
        }
        if (dp[n][m] != -1)
            return dp[n][m];
        if (s1.charAt(n - 1) == s2.charAt(m - 1))
            return dp[n][m] = LCSS(s1, s2, n - 1, m - 1, dp) + 1;
        else
            return dp[n][m] = Math.max(LCSS(s1, s2, n - 1, m, dp), LCSS(s1, s2, n, m - 1, dp));
    }

    public static int LCSS_DP(String s1, String s2, int N, int M, int[][] dp) {

        for (int n = 0; n <= N; n++) {
            for (int m = 0; m <= M; m++) {

                if (n == 0 || m == 0) {
                    dp[n][m] = 0;
                    continue;
                }

                if (s1.charAt(n - 1) == s2.charAt(m - 1))
                    dp[n][m] = dp[n - 1][m - 1] + 1;
                else
                    dp[n][m] = Math.max(dp[n - 1][m], dp[n][m - 1]);
            }
        }

        return dp[N][M];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length(), m = text2.length();
        int[][] dp = new int[n + 1][m + 1];
        return LCSS_DP(text1, text2, n, m, dp);
    }
}