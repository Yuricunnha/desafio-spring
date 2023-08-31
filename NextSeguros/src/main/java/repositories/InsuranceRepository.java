package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Insurance;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {

}
