package Tugas10;

public class TestStrukturStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrukturStack stack = new StrukturStack(3);
        System.out.print("### Sebelum Push ###");
        statusStack(stack);
        // Operasi push sebanyak 3 kali
        System.out.print("\n### Sesudah Push 3x###\n");
        stack.push(2);
        stack.push(4);
        stack.push(1);
        
        statusStack(stack);
        
        System.out.print("\n### Melakukan POP ###");
        stack.pop();
        statusStack(stack);
        
	}
        public static void statusStack(StrukturStack stack) {
        // Pengujian operasi-operasi stack
        System.out.println("\nSize: " + stack.size());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top : " + stack.top());
        System.out.println("Elemen From TOP : ");
        for (int i = stack.size() - 1; i >= 0; i--) {
        	System.out.print(stack.getElementAt(i) + " ");
        }
        
	}

}
