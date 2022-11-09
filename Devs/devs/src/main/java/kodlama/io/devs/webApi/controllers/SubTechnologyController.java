package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.SubTechnologyService;
import kodlama.io.devs.business.requests.subTechnology.CreateSubTechnologyRequest;
import kodlama.io.devs.business.responses.subTechnology.SubTechnologiesResponse;

@RestController
@RequestMapping("/api/subtechnologies")
public class SubTechnologyController {

	private SubTechnologyService subTechnologyService;

	@Autowired
	public SubTechnologyController(SubTechnologyService subTechnologyService) {
		this.subTechnologyService = subTechnologyService;
	}

	@PutMapping("/create-subtechnology")
	public void create(CreateSubTechnologyRequest createSubTechnologyRequest) {
		subTechnologyService.createSubTechnology(createSubTechnologyRequest); 
	}

	@GetMapping("/getall-subtechnologies")
	public List<SubTechnologiesResponse> getAllSubTechnologies() {
		return subTechnologyService.getAllSubTechnologiesResponse();
	}
}
