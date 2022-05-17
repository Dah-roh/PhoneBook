public class ContactOperations extends ContactStorage implements Operations<Contact> {
    @Override
    public Contact save(Contact v, String word, int number) {
        return null;
    }

    @Override
    public Contact save(Contact v) {
        contactList.add(v);
        findByName.put(v.getName(), Long.valueOf(contactList.indexOf(v)));
        findByNumber.put(v.getNumber().toString(), Long.valueOf(contactList.indexOf(v)));
        return v;
    }

    @Override
    public Contact delete(Contact v) {
        //soft delete
        return null;
    }


    @Override
    public Contact addTo(Contact v) {
        return null;
    }

    @Override
    public Contact search(String v) {
        //if the v is number or name
        //if v is name findByName else findByNumber
        //use found index to get contact from contactList
        return null;
    }
}
