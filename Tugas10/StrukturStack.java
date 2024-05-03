package Tugas10;

public class StrukturStack {
	private int[] array;
	private int capacity;
	private int TOP;
	public final int MIN = -1;
	
	public StrukturStack(int capacity) {
		super();
        array = new int[capacity];
        this.capacity = capacity;
        this.TOP = MIN;
	}

	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack Penuh");
		}else {	
			TOP++;
			array[TOP] = data;
			System.out.printf("Data " + data + ",");
		}
	}

	 public int pop() {
	        if(isEmpty()) {
	            System.out.println("Stack Kosong");
	            return -1; // or throw an exception
	        } else {
	            int data = array[TOP];
	            TOP--;
	            return data;
	        }
	    }

	    public boolean isFull() {
	        return TOP == capacity - 1;
	    }

	    public boolean isEmpty() {
	        return TOP == MIN;
	    }
	    public int size() {
	    	return TOP + 1;
	    }
	    
	    public int top() {
	        if(isEmpty()) {
	        	return -1;
	        } else {
	        	return array[TOP];
	        }
	    }
	    
	    public int getElementAt(int index) {
	        if (index >= 0 && index <= TOP) {
	            return array[index];
	        } else {
	            throw new IndexOutOfBoundsException("Indeks di luar jangkauan");
	        }
	    }
	    
}
