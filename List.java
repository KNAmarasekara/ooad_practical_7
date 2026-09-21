public class List {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>();
        java.util.Scanner sc = new java.util.Scanner(System.in);
 
        //entering data to the array
        if (numbers.isEmpty()) {
            System.out.println("Array is empty....");
            System.out.println("Enter 10 integers:");
            for (int i = 1; i <= 10; i++) {
                System.out.print("Number " + i + ": ");
                numbers.add(sc.nextInt());
            }
        } else {
            System.out.println("The array list already has data.....");
        }
 
        int total = 0;
        System.out.println(" ");
        System.out.println("The numbers are:");
        for (int i = 0; i < numbers.size(); i++) {
            int value = numbers.get(i);
            System.out.println(value);
            total += value;
        }
        System.out.println("\nTotal = " + total);
        sc.close();
    }
}
