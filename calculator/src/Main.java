class calculator {
    void add(int a) {
        System.out.println("sum: " + a);
    }
    void add(int a , int b) {
        System.out.println("sum(int): " + (a + b));
    }
    public static void main(String[] args) {
        calculator c = new
                calculator();
        c.add(50);
        c.add(10 + 5);
    }
}
