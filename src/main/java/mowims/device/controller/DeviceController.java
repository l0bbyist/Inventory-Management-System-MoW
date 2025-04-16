package mowims.device.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import mowims.device.model.Device;
import mowims.device.service.DeviceService;

import java.util.List;

@RestController
@RequestMapping("/devices")

public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    // Get list of devices
    @GetMapping
    @ResponseBody
    public List<Device> getAllDevicesAsJson() {
        return deviceService.getAllDevices();
   }
    
    // Get a device by ID
    @GetMapping("/{id}")
    public ResponseEntity<Device> getDeviceById(@PathVariable Integer id) {
        return deviceService.getDeviceById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Add a new device
    @PostMapping
    public Device createDevice(@RequestBody Device device) {
        return deviceService.createDevice(device);
    }

    // Update a device
    @PutMapping("/{id}")
    public ResponseEntity<Device> updateDevice(@PathVariable Integer id, @RequestBody Device updatedDevice) {
        return deviceService.updateDevice(id, updatedDevice)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Delete a device
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDevice(@PathVariable Integer id) {
        return deviceService.deleteDevice(id) ? 
            ResponseEntity.noContent().build() : 
            ResponseEntity.notFound().build();
    }
}

