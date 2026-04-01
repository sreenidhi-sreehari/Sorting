class PortfolioApp {
    static class Asset {
        String name;
        double ret, vol;

        Asset(String n, double r, double v) {
            name = n;
            ret = r;
            vol = v;
        }
    }

    static void mergeSort(Asset[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(Asset[] arr, int l, int m, int r) {
        Asset[] temp = new Asset[r - l + 1];
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r) {
            if (arr[i].ret <= arr[j].ret) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }

        while (i <= m) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];

        for (i = l, k = 0; i <= r; i++, k++) arr[i] = temp[k];
    }

    static int partition(Asset[] arr, int l, int r) {
        Asset pivot = arr[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (arr[j].ret > pivot.ret ||
                (arr[j].ret == pivot.ret && arr[j].vol < pivot.vol)) {
                i++;
                Asset t = arr[i]; arr[i] = arr[j]; arr[j] = t;
            }
        }
        Asset t = arr[i + 1]; arr[i + 1] = arr[r]; arr[r] = t;
        return i + 1;
    }

    static void quickSort(Asset[] arr, int l, int r) {
        if (l < r) {
            int pi = partition(arr, l, r);
            quickSort(arr, l, pi - 1);
            quickSort(arr, pi + 1, r);
        }
    }
}