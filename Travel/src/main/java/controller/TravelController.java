package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Travel;
import dao.TravelDao;

@RestController
@RequestMapping("/travel")
public class TravelController {

	@Autowired
	private TravelController traCon;

	@RequestMapping(path = "/test")
	public ResponseEntity<String> test() {
		return new ResponseEntity<>("Thai An ne", HttpStatus.OK);
	}

	@PostMapping(path = "/add")
	public ResponseEntity<Travel> addTravel(@RequestBody Travel newTravel) {

		Travel travel = traCon.save(newTravel);
		return new ResponseEntity<>(travel, HttpStatus.OK);
	}

	private Travel save(Travel newTravel) {
		// TODO Auto-generated method stub
		return null;
	}

}