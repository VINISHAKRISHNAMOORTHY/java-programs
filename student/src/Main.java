class student {
    private String name;
    public String getName()
    {
        return name;
    }
    public void setName(String newName)
    {
        name = newName;
    }
    public static void main(String[] args) {
        student s = new student();
        s.setName("vinisha");
        System.out.println("Name: " + s.getName());

    }

}
