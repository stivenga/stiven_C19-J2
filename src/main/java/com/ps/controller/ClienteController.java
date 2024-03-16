package com.ps.controller;

import com.ps.model.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Decir que esta clase es administrada o controlada por SPRING
@RequestMapping("/clientes") //Agregar una ruta para mi clase
public class ClienteController {

    //ResponseEntity nos sirven para dar respuesta a peticiones con estas... 200 404, 500


    @GetMapping
    public List<Cliente> getAllClientes(){
        return null;
    }


    @GetMapping
    public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) {
        Cliente cliente = clienteService.getClienteById(id);
        return ResponseEntity.ok(cliente);
    }

    @PostMapping
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
        Cliente createdCliente = clienteService.createOrUpdateCliente(cliente);
        return new ResponseEntity<>(createdCliente, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Cliente> updateCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        cliente.setClientId(id);
        Cliente updatedCliente = clienteService.createOrUpdateCliente(cliente);
        return ResponseEntity.ok(updatedCliente);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteCliente(@PathVariable Long id) {
        clienteService.deleteCliente(id);
        return ResponseEntity.noContent().build();
    }


}
