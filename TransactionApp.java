class TransactionApp {
    static class Transaction {
        String id;
        double fee;
        String ts;

        Transaction(String id, double fee, String ts) {
            this.id = id;
            this.fee = fee;
            this.ts = ts;
        }
    }

    static void bubbleSort(Transaction[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].fee > arr[j + 1].fee) {
                    Transaction t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    static void insertionSort(Transaction[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Transaction key = arr[i];
            int j = i - 1;
            while (j >= 0 && (arr[j].fee > key.fee ||
                    (arr[j].fee == key.fee && arr[j].ts.compareTo(key.ts) > 0))) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}