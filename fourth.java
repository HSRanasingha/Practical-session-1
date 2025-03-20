

// Class One with instance variables and a method

class One {

           int a = 10; // Variable definition (initialized)

           int b;      // Variable declaration (uninitialized, defaults to 0)

 

          void printDetails() { // Method to print values of a and b

                  System.out.println("From class One a = " + a);

                  System.out.println("From class One b = " + b);

    }

}

 

// Class Two with instance variables and a method

class Two {

     int a, c; // Both uninitialized, default to 0

 

         void printDetails() { // Method to print values of a and c

                 System.out.println("From class Two a = " + a);

                 System.out.println("From class Two c = " + c);

    }

}

 

// Main class where objects of One and Two are created and methods are called

class App {

          public static void main(String[] args) {

                One o1 = new One();  // Object of class One

                Two t1 = new Two();  // Object of class Two

       

              o1.printDetails();  // Calling method for class One

             t1.printDetails();  // Calling method for class Two

    }

}