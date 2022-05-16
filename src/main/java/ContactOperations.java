public class ContactOperations extends ContactStorage implements Operations<Contact> {
    @Override
    public Contact save(Contact v) {
        contactList.add(v);
        findByName.put(v.getName(), Long.valueOf(contactList.indexOf(v)));
        findByNumber.put(v.getNumber().toString(), Long.valueOf(contactList.indexOf(v)));
        return v;
    }

    @Override
    public Contact delete(Contact v) {
        return null;
    }

    @Override
    public Contact addTo(Contact v) {
        return null;
    }

    @Override
    public Contact search(Contact v) {
        return null;
    }
}
