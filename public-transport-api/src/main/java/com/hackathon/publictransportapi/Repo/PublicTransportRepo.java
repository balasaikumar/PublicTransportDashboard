package com.hackathon.publictransportapi.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.publictransportapi.entities.Bus;


public interface PublicTransportRepo extends JpaRepository<Bus,Long>{

}
