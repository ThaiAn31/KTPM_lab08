package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Travel;

public interface TravelDao extends JpaRepository<Travel, Integer>{
	
	public List<Travel> findByidTravel(Integer id);

}