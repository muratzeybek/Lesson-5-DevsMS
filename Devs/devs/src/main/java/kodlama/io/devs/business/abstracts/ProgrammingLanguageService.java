package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import kodlama.io.devs.business.responses.programmingLanguage.ProgrammingLanguagesResponse;

public interface ProgrammingLanguageService {
	void createProgrammingLanguage(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);
	void updateProgrammingLanguage();
	void deleteProgrammingLanguage(int id);
	ProgrammingLanguagesResponse getByIdProgrammingLanguageResponse(int id);
	List<ProgrammingLanguagesResponse> getAllProgrammingLanguagesResponse();
}
