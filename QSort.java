class QSort {
	int[] arr = { 3,5,6,6,1,3,0,8};//edited this array 

	int qsort(int l, int h) {
		int piviot = arr[l], i = l, j = h;
		while (i < j) {
				do {
					++i;
				} while (i<j && piviot >= arr[i]);
			do {
				--j;
			} while (piviot < arr[j]);
			if (i < j) {
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
			print();
		}
		System.out.println("pivot ="+ piviot +"having index ="+l);
		arr[l] = arr[j];
		arr[j] = piviot;
		print();
		System.out.println("pivot exchanged");
		return j;
	}

	void QSORT(int l, int h) {
		if (l < h) {
			int j = qsort(l, h);
			QSORT(l, j);
			QSORT(j + 1, h);
		}
	}

	void print() {
		for (int I = 0; I < arr.length; I++)
			System.out.print(arr[I] + ",");
		System.out.println();
	}

	public static void main(String args[]) {
		QSort obj = new QSort();
		obj.QSORT(0, obj.arr.length);
		obj.print();
	}
}
