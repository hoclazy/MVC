import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    List<Customer> customerList = new ArrayList<>();

    public CustomerServiceImpl() {
        customerList.add(new Customer(1,"nam", "nam@gmail.com", "hà nội"));
        customerList.add(new Customer(2,"nga", "nga@gmail.com", "hà nam"));
        customerList.add(new Customer(3,"ngan", "ngan@gmail.com", "hà tĩnh"));
        customerList.add(new Customer(4,"hoang", "hoang@gmail.com", "hà đông"));

    }

    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customerList;
        }

    @Override
    public void save(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId()==id) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public void update(int id, Customer customer) {
        customerList.set(findById(id), new Customer());
    }

    @Override
    public void remove(int id) {
        customerList.remove(findById(id));
    }
}
