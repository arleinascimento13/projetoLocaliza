package Repository;

import java.util.List;

public interface IRepository<T> {
    void create (T i);
    List<T> getAll();
    T get(String i);
    void delete(T i);
    void edit (T i);
}
