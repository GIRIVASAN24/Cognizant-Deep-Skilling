// Spring Data JPA Example

// EmployeeRepository.java
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {}

// EmployeeService.java
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}