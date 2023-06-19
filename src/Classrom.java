class Classroom{
    public static void main(String[] args) {
        Wilder wilder1 = new Wilder("John", true);
        Wilder wilder2 = new Wilder("Alice", false);
        Wilder wilder3 = new Wilder("Bob", true);

        // Displaying information about each instance using whoAmI() method
        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
        System.out.println(wilder3.whoAmI());
    }
}