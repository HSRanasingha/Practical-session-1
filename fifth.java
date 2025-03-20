class One {
    int a = 20; // Initialized
    int b; // Default value is 0

    void printDetails() {
        System.out.println("From class One: a = " + a);
        System.out.println("From class One: b = " + b);
    }
}

class Two {
    int a; // Default value 0
    int c; // Default value 0

    void printDetails() {
        System.out.println("From class Two: a = " + a);
        System.out.println("From class Two: c = " + c);
    }
}

class Apps {
    public static void main(String[] args) {
        One o1 = new One();
        Two t2 = new Two();

        o1.printDetails(); // Print initial values of o1
        o1.a = 10; // Corrected variable name
        o1.printDetails();

        o1.b = 100; // Assigning value to b
        o1.printDetails();

        t2.printDetails(); // Print initial values of t2

        t2.a = 20; // Assign values to t2
        t2.c = 30;
        t2.a = 40; // Overwriting a

        t2.printDetails(); // Print updated values
    }
}