package com.ps.service.imp;

import com.ps.model.Cliente;

import com.ps.model.Prestamo;
import com.ps.repository.PrestamoRepository;
import com.ps.service.IPrestamoService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PrestamoService implements IPrestamoService {

    private final PrestamoRepository prestamoRepository;


    @Override
    public Prestamo getPrestamoById(Long id) {
        return null;
    }

    @Override
    public Prestamo createPrestamo(Prestamo prestamo) {
        return null;
    }

    @Override
    public Prestamo updatePrestamo(Prestamo prestamo) {
        return null;
    }

    @Override
    public void deletePrestamo(Long id) {

    }
}