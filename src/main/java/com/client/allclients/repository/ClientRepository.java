package com.client.allclients.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.allclients.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
