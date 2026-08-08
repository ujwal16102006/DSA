class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[] suf = new int[m + 1];
        suf[m] = n;
        int j = m - 1;
        for (int i = n - 1; i >= 0 && j >= 0; i--) {
            if (word1.charAt(i) == word2.charAt(j)) {
                suf[j] = i;
                j--;
            }
        }
        int[] ans = new int[m];
        int p = 0;
        boolean changed = false;
        for (int i = 0; i < n && p < m; i++) {
            if (word1.charAt(i) == word2.charAt(p)) {
                ans[p++] = i;
            } 
            else if (!changed) {
                if (p + 1 == m || suf[p + 1] > i) {
                    ans[p++] = i;
                    changed = true;
                }
            }
        }
        if (p != m)
            return new int[0];
        return ans;
    }
}