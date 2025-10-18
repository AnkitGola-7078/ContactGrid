package contactgrid.example.contactgrid_integration.controller;

import contactgrid.example.contactgrid_integration.model.User;
import contactgrid.example.contactgrid_integration.repository.ContactRepository;
import contactgrid.example.contactgrid_integration.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;
    private ContactService contactService;

    //register Page
    @GetMapping("/register")
    public String registerPage(Model model) {
        model.addAttribute("user", new User());
        return "Register";
    }

    //login Page
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    //home Page
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    //view Contacts
    @GetMapping("/contacts")
    public String viewContacts(Model model) {
        model.addAttribute("contacts", contactRepository.findAll());
        return "view-contact";
    }

    //Add Contact
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("contact", new User());
        return "add-phone";
    }

    //save contact
    @PostMapping("/contacts")
    public String saveContact(@ModelAttribute User contact) {
        contactRepository.save(contact);
        return "redirect:/contacts";
    }

    //edit contact
    @PostMapping("/contacts/edit")
    public String showEditForm(@RequestParam Long id, Model model) {
        User contact = contactRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contact not found"));
        model.addAttribute("contact", contact);
        return "edit-contact";
    }

    //update contacts
    @GetMapping("/contacts/update")
    public String updateContact(@ModelAttribute User contact) {
        contactRepository.save(contact);
        return "redirect:/contacts";
    }

    //delete contact
    @PostMapping("/contacts/delete")
    public String deleteContact(@RequestParam Long id) {
        contactRepository.deleteById(id);
        return "redirect:/contacts";
    }
    // Search Contact by Name
//    @GetMapping("/contacts/search")
//    public String searchContacts(@RequestParam String keyword, Model model) {
//        List<User> results = contactService.searchByName(keyword);
//        model.addAttribute("contacts", results);
//        return "view-contact";
//    }


}

