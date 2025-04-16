package mowims.inventoryreport.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mowims.inventoryreport.model.InventoryReport;
import mowims.inventoryreport.repository.InventoryReportRepository;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryReportService {

    @Autowired
    private InventoryReportRepository inventoryReportRepository;

    // Fetch all inventory reports
    public List<InventoryReport> getAllInventoryReports() {
        return inventoryReportRepository.findAll();
    }

    // Fetch a specific inventory report by ID
    public Optional<InventoryReport> getInventoryReportById(Long id) {
        return inventoryReportRepository.findById(id);
    }

    // Add a new inventory report
    public InventoryReport createInventoryReport(InventoryReport inventoryReport) {
        return inventoryReportRepository.save(inventoryReport);
    }

    // Delete an inventory report
    public boolean deleteInventoryReport(Long id) {
        return inventoryReportRepository.findById(id).map(report -> {
            inventoryReportRepository.delete(report);
            return true;
        }).orElse(false);
    }
}
