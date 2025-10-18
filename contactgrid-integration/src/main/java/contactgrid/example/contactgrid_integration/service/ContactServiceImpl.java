package contactgrid.example.contactgrid_integration.service;


import contactgrid.example.contactgrid_integration.model.User;
import contactgrid.example.contactgrid_integration.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    // Create
    @Override
    public User saveContact(User contact) {
        return contactRepository.save(contact);
    }

    // Read all
    @Override
    public List<User> getAllContacts() {
        return (List<User>) contactRepository.findAll();
    }

    // Read by ID
    @Override
    public Optional<User> getContactById(Long id) {
        return contactRepository.findById(id);
    }

    // Update
    @Override
    public User updateContact(Long id, User updatedContact) {
        Optional<User> existing = contactRepository.findById(id);
        if (existing.isPresent()) {
            User contact = existing.get();
            contact.setName(updatedContact.getName());
            contact.setEmail(updatedContact.getEmail());
            contact.setPhone(updatedContact.getPhone());
            return contactRepository.save(contact);
        } else {
            throw new RuntimeException("Contact not found with ID: " + id);
        }
    }

    // Delete
    @Override
    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }



}