package Repository;

public class RepositoryUtils {
    public static <T> void addToRepository(IRepository repository, T obj){
        repository.create(obj);
    }
}
