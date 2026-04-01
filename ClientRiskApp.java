class ClientRiskApp {
    static class Client {
        String name;
        int risk;
        double balance;

        Client(String n, int r, double b) {
            name = n;
            risk = r;
            balance = b;
        }
    }

    static void bubbleSort(Client[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].risk > arr[j + 1].risk) {
                    Client t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    static void insertionSort(Client[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;
            while (j >= 0 && (arr[j].risk < key.risk ||
                    (arr[j].risk == key.risk && arr[j].balance < key.balance))) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}