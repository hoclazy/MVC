import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    int findById(int id);
    void update(int id, Customer customer);
    void remove(int id);

}
