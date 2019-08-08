package de.igorakkerman.challenge.binarygap;

class BinaryGap {
    public static int binaryGap(int n) {
        char[] chars = Integer.toBinaryString(n).toCharArray();
        int max = 0;
        int cur = 0;
        for (char c : chars) {
            if (c == '0')
                cur++;
            else {
                max = Math.max(max, cur);
                cur = 0;
            }
        }
        return max;
    }
}
