package mowims.inventoryreport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mowims.inventoryreport.model.InventoryReport;

public interface InventoryReportRepository extends JpaRepository<InventoryReport, Long> {
}
