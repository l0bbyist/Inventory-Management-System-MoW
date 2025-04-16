package mowims.staff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import mowims.staff.model.Staff;
import mowims.staff.service.StaffService;

import java.util.List;

@RestController
@RequestMapping("/staffs")

public class StaffController {

    @Autowired
    private StaffService staffService;

    // Get list of staff
    @GetMapping
    @ResponseBody
    public List<Staff> getAllStaffsAsJson() {
        return staffService.getAllStaffs();
   }
    
    // Get a staff by ID
    @GetMapping("/{id}")
    public ResponseEntity<Staff> getStaffById(@PathVariable Integer id) {
        return staffService.getStaffById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Add a new staff
    @PostMapping
    public Staff createStaff(@RequestBody Staff staff) {
        return staffService.createStaff(staff);
    }

    // Update a staff
    @PutMapping("/{id}")
    public ResponseEntity<Staff> updateStaff(@PathVariable Integer id, @RequestBody Staff updatedStaff) {
        return staffService.updateStaff(id, updatedStaff)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Delete a staff
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStaff(@PathVariable Integer id) {
        return staffService.deleteStaff(id) ? 
            ResponseEntity.noContent().build() : 
            ResponseEntity.notFound().build();
    }
}

