package ss10_dsa_list.exercise.simulation_array_list;

import java.util.Arrays;


    public class MyList<E> {


        private int size = 0;
        private static final int DEFAULT_CAPACITY = 10;
        private Object elements[];

        public MyList() {
            this(DEFAULT_CAPACITY);
        }

        public MyList(int capacity) {
            elements = new Object[DEFAULT_CAPACITY];
        }


        private void ensureCapacity() {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
// * add : trong arrayList nếu index nhỏ hơn không hoặc lớn hơn số lượng phần tử của mảng chúng ta sẽ nhận được IndexOutOfBoundsException
        public boolean add(E element) {
            if (size == elements.length) {
                ensureCapacity();
            }
            elements[size++] = element;
            return true;
        }

        public void add(int index, E element) {
            if (size == elements.length) {
                ensureCapacity();
            }
            for (int i = 0; i < elements.length - 1; i++) {
                if (i == index) {
                    for (int j = size; j > index - 1; j--) {
                        elements[j + 1] = elements[j];
                    }
                    elements[index] = element;
                    size++;
                }
            }
        }

        public Object remove(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException
                        ("index " + index + " out of bounds");
            }

            Object e = elements[index];


            for (int j = index; j < size - 1; j++)
                elements[j] = elements[j + 1];

            elements[size - 1] = null;


            size--;
            return e;
        }

        public E get(int index) {
            return (E) elements[index];
        }

        public boolean contains(E o) {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i]))
                    return true;
            }
            return false;
        }
        public int size(){
            return size;
        }


        public void clear() {
            for (int i = 0; i < size; i++) {
                elements[i] = null;
                size = 0;
            }

        }

        public MyList<E> clone() throws CloneNotSupportedException {
            MyList<E> cloneItem = new MyList<E>();
            cloneItem.elements =  cloneItem.elements.clone();
            cloneItem.size =  cloneItem.size();
            return cloneItem;
        }

        public int indexOf(E e){
            for (int i = 0;i < size;i++){
                if (e.equals(elements[i])){
                    return i;
                }
            }
            return -1;
        }

    }
    


















