package contactgrid.example.contactgrid_integration.service;

import contactgrid.example.contactgrid_integration.model.User;
import java.util.List;
import java.util.Optional;

public interface ContactService {

    // Create
    User saveContact(User contact);
    // Read
    List<User> getAllContacts();
    Optional<User> getContactById(Long id);

    // Update
    User updateContact(Long id, User updatedContact);

    // Delete
    void deleteContact(Long id);

}

