package com.travel_agency.travel_agency.repo;

import com.travel_agency.travel_agency.models.ClientInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ClientRepository extends JpaRepository<ClientInfo, Long> {
    ClientInfo findByEmail(String email);
}
