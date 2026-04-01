class RiskThresholdApp {
    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    static int floor(int[] arr, int x) {
        int l = 0, r = arr.length - 1, ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] <= x) {
                ans = arr[m];
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }

    static int ceil(int[] arr, int x) {
        int l = 0, r = arr.length - 1, ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] >= x) {
                ans = arr[m];
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }

    static int insertionPoint(int[] arr, int x) {
        int l = 0, r = arr.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] < x) l = m + 1;
            else r = m;
        }
        return l;
    }
}