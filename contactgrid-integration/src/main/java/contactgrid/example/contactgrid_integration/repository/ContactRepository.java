package contactgrid.example.contactgrid_integration.repository;

import contactgrid.example.contactgrid_integration.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends CrudRepository<User, Long> {
    List<User> findByNameContainingIgnoreCase(String keyword);

    // List<Contact> findByNameContaining(String name);
    static User findByEmail(String email) {
        return null;
    }
    static User findByName(String name) {
        return null;
    }


}
