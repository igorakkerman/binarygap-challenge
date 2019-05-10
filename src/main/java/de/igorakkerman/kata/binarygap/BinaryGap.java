package de.igorakkerman.kata.binarygap;

class BinaryGap {
    public static int binaryGap(int n) {
        char[] chars = Long.toBinaryString(n).toCharArray();
        int max = 0;
        int cur = 0;
        for (char aChar : chars) {
            if (aChar == '0')
                cur++;
            else {
                max = Math.max(max, cur);
                cur = 0;
            }
        }
        return max;
    }
}
