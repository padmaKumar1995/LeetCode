public class Solution {
    public IList<int> SequentialDigits(int low, int high) {
        int window = getStart(low);
        List<int> seqNums = new List<int>();

        int[] digits = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        while(window <= 9) {
            int l = 0, r = window - 1;

            while(r < 9) {
                int seqNum = getInt(l, r, digits);

                if(seqNum >= low && seqNum <= high) {
                    seqNums.Add(seqNum);
                }
                else if(seqNum > high) {
                    return seqNums;
                }
                l++;
                r++;
            }
            window++;
        }

        return seqNums;
    }

    private int getStart(int low) {
        int start = 0;

        while(low > 0) {
            low /= 10;
            start++;
        }

        return start;
    }

    private int getInt(int l, int r, int[] digits) {
        int seqNum = digits[l] * 10;
        l++;

        while(l < r) {
            seqNum += digits[l];
            seqNum *= 10;
            l++;
        }

        seqNum += digits[l];

        return seqNum;
    } 
}