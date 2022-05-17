public interface Operations<T> {
    //Agree all terms and conditions

    T save(T v, String word, int number);
    T save(T v);
    T delete(T v);
    T addTo(T v);
    T search(String v);
}
