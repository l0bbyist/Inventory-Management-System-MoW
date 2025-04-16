package mowims.inventoryreport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import mowims.inventoryreport.model.InventoryReport;
import mowims.inventoryreport.service.InventoryReportService;

import java.util.List;

@RestController
@RequestMapping("/api/inventory-reports")
public class InventoryReportController {

    @Autowired
    private InventoryReportService inventoryReportService;

    // Fetch all inventory reports
    @GetMapping
    public List<InventoryReport> getAllInventoryReports() {
        return inventoryReportService.getAllInventoryReports();
    }

    // Fetch a specific report by ID
    @GetMapping("/{id}")
    public ResponseEntity<InventoryReport> getInventoryReportById(@PathVariable Long id) {
        return inventoryReportService.getInventoryReportById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Add a new inventory report
    @PostMapping
    public InventoryReport createInventoryReport(@RequestBody InventoryReport inventoryReport) {
        return inventoryReportService.createInventoryReport(inventoryReport);
    }

    // Delete an inventory report
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInventoryReport(@PathVariable Long id) {
        return inventoryReportService.deleteInventoryReport(id) ? 
            ResponseEntity.noContent().build() : 
            ResponseEntity.notFound().build();
    }

    // Print inventory report (you can define how this works with your frontend)
    @GetMapping("/print")
    public void printInventoryReport() {
        // Implement logic to print inventory report using the printer icon in the UI
        // You could send data to the frontend for printing
    }
}
