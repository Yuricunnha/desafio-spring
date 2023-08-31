package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Vehicle;

public interface VehicleRepository extends JpaRepository <Vehicle, Long> {

}
