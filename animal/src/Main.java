class mother {
    void teaches() {
        System.out.println("mother teaches");
    }
}
class daughter extends mother {
    void listens() {
        System.out.println("daughter listens");
    }
    public static void main(String[] args) {
        daughter d = new daughter();
        d.teaches();
        d.listens();
    }
}