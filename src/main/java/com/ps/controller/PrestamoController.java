package com.ps.controller;

import com.ps.model.Prestamo;
import com.ps.service.IPrestamoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/prestamos")
public class PrestamoController {
    private final IPrestamoService iPrestamoService;

    @GetMapping("/{id}")
    public ResponseEntity<Prestamo> getPrestamoById(@PathVariable Long id) {
        Prestamo prestamo = iPrestamoService.getPrestamoById(id);
        return ResponseEntity.ok(prestamo);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity<Prestamo> createPrestamo(@RequestBody Prestamo prestamo) {
        Prestamo createdPrestamo = iPrestamoService.createPrestamo(prestamo);
        return new ResponseEntity<>(createdPrestamo, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Prestamo> updatePrestamo(@RequestBody Prestamo prestamo) {
        Prestamo updatedPrestamo = iPrestamoService.updatePrestamo(prestamo);
        return ResponseEntity.ok(updatedPrestamo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePrestamo(@PathVariable Long id) {
        iPrestamoService.deletePrestamo(id);
        return ResponseEntity.noContent().build();
    }
}
