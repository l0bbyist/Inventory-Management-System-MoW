package mowims.staff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mowims.staff.model.Staff;
import mowims.staff.repository.StaffRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StaffService {

    @Autowired
    private StaffRepository staffRepository;

    // Get all staffs
    public List<Staff> getAllStaffs() {
        return staffRepository.findAll();
    }

    // Get staff by ID
    public Optional<Staff> getStaffById(Integer id) {
        return staffRepository.findById(id);
    }

    // Create a new staff
    public Staff createStaff(Staff staff) {
        return staffRepository.save(staff);
    }

    // Update an existing staff
    public Optional<Staff> updateStaff(Integer id, Staff updatedStaff) {
        return staffRepository.findById(id).map(staff -> {
            staff.setcheque_no(updatedStaff.getcheque_no());
            staff.setemail(updatedStaff.getemail());
            staff.setname(updatedStaff.getname());
            staff.setoffice(updatedStaff.getoffice());
            staff.setphone(updatedStaff.getphone());
            return staffRepository.save(staff);
        });
    }

    // Delete staff by ID
    public boolean deleteStaff(Integer id) {
        return staffRepository.findById(id).map(staff -> {
            staffRepository.delete(staff);
            return true;
        }).orElse(false);
    }
}

