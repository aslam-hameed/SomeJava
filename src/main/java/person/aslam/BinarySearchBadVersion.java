package person.aslam;

public class BinarySearchBadVersion {

    int badVersion;
    public static void main(String[] args) {
        BinarySearchBadVersion bs = new BinarySearchBadVersion();
        bs.badVersion = 1702766719;
        System.out.println(bs.firstBadVersion(2126753390) == 1702766719);
    }

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        long total = start + end;
        int mid = (int) (total/2);
        while(start <= end) {
            if(start == end) {
                return start;
            } else if(!isBadVersion(mid)) {
                start = mid + 1;
                total = (long)start + (long)end;
                mid = (int) (total/2);
            } else if (isBadVersion(mid)) {
                end = mid;
                mid = end/2;
            }
        }
        return 0;
    }

    boolean isBadVersion(int num) {
        return num >= badVersion;
    }

}
