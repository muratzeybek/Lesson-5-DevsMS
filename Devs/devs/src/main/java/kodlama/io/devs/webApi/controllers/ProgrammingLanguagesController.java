package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import kodlama.io.devs.business.responses.programmingLanguage.ProgrammingLanguagesResponse;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {

	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}

	@PostMapping("/create-programminglanguage")
	void createProgrammingLanguage(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		programmingLanguageService.createProgrammingLanguage(createProgrammingLanguageRequest);
	}

	@DeleteMapping("/delete-programmingLanguage")
	public void deleteById(int id) {
		programmingLanguageService.deleteProgrammingLanguage(id);
	}

	@GetMapping("/getall-programminglanguages")
	public List<ProgrammingLanguagesResponse> getAllProgrammingLanguages() {
		return programmingLanguageService.getAllProgrammingLanguagesResponse();
	}

	@GetMapping("/getbyid-programminglanguage")
	public ProgrammingLanguagesResponse getByIdProgrammingLanguage(int id) {
		return programmingLanguageService.getByIdProgrammingLanguageResponse(id);
	}

	@PutMapping("/update-programminglanguage")
	void updateProgrammingLanguage() {
	}
}
