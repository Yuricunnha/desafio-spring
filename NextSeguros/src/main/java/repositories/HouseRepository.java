package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.House;

public interface HouseRepository extends JpaRepository<House, Long>{

}
