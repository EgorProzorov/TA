package com.travel_agency.travel_agency.repo;

import com.travel_agency.travel_agency.models.ClientInfo;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<ClientInfo, Long> {

}
