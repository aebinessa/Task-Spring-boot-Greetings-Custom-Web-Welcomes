package binjesytems.binjesusDemo.controller;

import binjesytems.binjesusDemo.bo.ContactRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ContactController {
    private List<ContactRequest> contactList = new ArrayList<>();


    @PostMapping("/addContact")
    public ResponseEntity<String> addContact(@RequestBody ContactRequest contactRequest) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getEmail().equals(contactRequest.getEmail())) {
                return ResponseEntity.badRequest().body("Contact already registered");
            }
        }
        contactList.add(contactRequest);
        return ResponseEntity.ok("contact registered successfully");
    }


    @GetMapping("/getContactDetails")
    public ResponseEntity<?> getContactDetails(@RequestParam String name) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getName().equals(name)) {
                return ResponseEntity.ok(contactList.get(i));
            }
        }
        return ResponseEntity.badRequest().body("contact not found");
    }
}
