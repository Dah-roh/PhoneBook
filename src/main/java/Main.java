public class Main extends ContactOperations{
    public static void main(String[] args) {
    Contact contact = new Contact();
    contact.setAddress("blah blah blah");
    contact.setName("Blah");
    contact.getNumber().add("08154794351");
    Main main = new Main();
    main.save(contact);
        System.out.println(contact);

    }
}
