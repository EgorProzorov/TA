package com.travel_agency.travel_agency.repo;

import com.travel_agency.travel_agency.models.ClientInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<ClientInfo, Long> {

}
