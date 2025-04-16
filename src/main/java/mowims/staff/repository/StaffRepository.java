package mowims.staff.repository;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import mowims.staff.model.Staff;

public interface StaffRepository extends JpaRepository<Staff, Integer> {
   //Optional<Staff> findByEmail(String email); // Fetch staff by email
    
    //Staff findByEmail(String email);

}
