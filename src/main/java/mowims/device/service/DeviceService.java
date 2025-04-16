package mowims.device.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mowims.device.model.Device;
import mowims.device.repository.DeviceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    // Get all devices
    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    // Get device by ID
    public Optional<Device> getDeviceById(Integer id) {
        return deviceRepository.findById(id);
    }

    // Create a new device
    public Device createDevice(Device device) {
        return deviceRepository.save(device);
    }

    // Update an existing device
    public Optional<Device> updateDevice(Integer id, Device updatedDevice) {
        return deviceRepository.findById(id).map(device -> {
            device.setDev_NAME(updatedDevice.getDev_NAME());
            device.setBRAND(updatedDevice.getBRAND());
            device.setSERIAL(updatedDevice.getSERIAL());
            device.setDev_OS(updatedDevice.getDev_OS());
            device.setSTATUS(updatedDevice.getSTATUS());
            device.setDate_Added(updatedDevice.getDate_Added());
            return deviceRepository.save(device);
        });
    }

    // Delete device by ID
    public boolean deleteDevice(Integer dev_ID) {
        return deviceRepository.findById(dev_ID).map(device -> {
            deviceRepository.delete(device);
            return true;
        }).orElse(false);
    }
}

