public interface Operations<T> {
    T save(T v);
    T delete(T v);
    T addTo(T v);
    T search(T v);
}
