class Args2 {
    public static void main(String[] ar) {
        if (ar.length >= 2) {
            System.out.println("The first argument is " + ar[0]);
            System.out.println("The second argument is " + ar[1]);
        } else {
            System.out.println("Please provide at least two arguments.");
        }
    }
}