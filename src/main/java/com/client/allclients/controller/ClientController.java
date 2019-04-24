package com.client.allclients.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.allclients.exception.ResourceNotFoundException;
import com.client.allclients.model.Client;
import com.client.allclients.repository.ClientRepository;

@RestController
@RequestMapping("client-api")
public class ClientController {

	@Autowired
	ClientRepository clientRepository;
	
	@GetMapping("/clients")
	public List<Client> getAllClients() {
		return clientRepository.findAll();
	}
	
	@PostMapping("clients")
	public Client createClient(@Valid @RequestBody Client client) {
		return clientRepository.save(client);
	}
	
	@GetMapping("clients/{id}")
	public Client getClientById(@PathVariable(value = "id") Long clientId) {
		return clientRepository.findById(clientId)
				.orElseThrow(() -> new ResourceNotFoundException("Client", "id", clientId));
	}
	
	@PutMapping("clients/{id}")
	public Client updateClient(@PathVariable(value = "id") Long clientId, @Valid @RequestBody Client clientDetails) {
		
		Client client = clientRepository.findById(clientId).orElseThrow(() -> new ResourceNotFoundException("Client", "id", clientId));
		
		client.setCpf(clientDetails.getCpf());
		client.setNome(clientDetails.getNome());
		client.setEmail(clientDetails.getEmail());
		client.setDataNascimento(clientDetails.getDataNascimento());
		client.setSexo(clientDetails.getSexo());
		client.setEstadoCivil(clientDetails.getEstadoCivil());
		client.setAtivo(clientDetails.getAtivo());
		
		return clientRepository.save(client);
	}
	
	@DeleteMapping("clients/{id}")
	public ResponseEntity<?> deleteClient(@PathVariable(value = "id") Long clientId) {
		Client client = clientRepository.findById(clientId)
				.orElseThrow(() -> new ResourceNotFoundException("Client", "id", clientId));
		
		clientRepository.delete(client);
		
		return ResponseEntity.ok().build();
	}
	
	
}
