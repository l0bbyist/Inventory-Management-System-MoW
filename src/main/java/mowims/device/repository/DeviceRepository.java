package mowims.device.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import mowims.device.model.Device;

//@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer> {
    // Additional custom queries can be added here if needed
}
