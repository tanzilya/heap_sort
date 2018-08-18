package com.example.tanzilyayakshimbetova.javatest;

public class HeapSortClass {

    public void heap_sort(int[] A) {
        int heap_size = A.length;
        build_max_heap(A, A.length);
        for (int i = A.length - 1; i >= 1; i--) {
            exchange(A, 0, i);
            heap_size--;
            max_heapify(A, 0, heap_size);
        }
    }

    public void build_max_heap(int[] A, int heap_size) {
        for (int i = heap_size/2 - 1 ; i >= 0; i--) {
            max_heapify(A, i, heap_size);
        }

    }

    public void max_heapify(int[] A, int i, int heap_size) {
        int l = left(i);
        int r = right(i);
        int largest = 0;
        if (l < heap_size && A[l] > A[i]) {
            largest = l;
        }
        else {
            largest = i;
        }
        if (r < heap_size && A[r] > A[largest]) {
            largest = r;
        }
        if (largest != i) {
            exchange(A, i, largest);
            max_heapify(A, largest, heap_size);
        }
    }

    public void exchange(int[] A, int from, int to) {
        int tmp = A[from];
        A[from] = A[to];
        A[to] = tmp;
    }

    public int left(int i) {
        return 2*i + 1;
    }

    public int right(int i) {
        return 2*i + 2;
    }

    public int parent(int i) {
        return i / 2 - 1 ;
    }

}
