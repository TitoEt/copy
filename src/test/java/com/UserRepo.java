package com.castletroymedical.database.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<PatientDTO, AdminDTO, Long> {

}