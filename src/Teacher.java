public class Teacher<T>implements IDatabase<T>{
    @Override
    public boolean add(T data) {
        System.out.println("data added");
        return false;
    }

    @Override
    public boolean update(T data) {
        System.out.println("System updated");
        return false;
    }

    @Override
    public boolean delete(T data) {
        System.out.println("Data deleted");
        return false;
    }

    @Override
    public void select(T data) {
        System.out.println(data);
        System.out.println("Data pulled");

    }
}
