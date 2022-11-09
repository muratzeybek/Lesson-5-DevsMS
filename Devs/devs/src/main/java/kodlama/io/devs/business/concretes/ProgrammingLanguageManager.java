package kodlama.io.devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import kodlama.io.devs.business.responses.programmingLanguage.ProgrammingLanguagesResponse;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import kodlama.io.devs.entities.concretes.SubTechnology;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public void createProgrammingLanguage(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setLanguageName(createProgrammingLanguageRequest.getProgrammingLanguageName());
		programmingLanguageRepository.save(programmingLanguage);
	}

	@Override
	public void updateProgrammingLanguage() {
	}

	@Override
	public void deleteProgrammingLanguage(int id) {
		programmingLanguageRepository.deleteById(id);
		;
	}

	@Override
	public List<ProgrammingLanguagesResponse> getAllProgrammingLanguagesResponse() {
		List<ProgrammingLanguagesResponse> languagesResponses = new ArrayList<>();
		
		for (ProgrammingLanguage programmingLanguage : programmingLanguageRepository.findAll()) {
			List<String> subTechnologyNames = new ArrayList<>();

			ProgrammingLanguagesResponse allProgrammingLanguagesResponse = new ProgrammingLanguagesResponse();
			allProgrammingLanguagesResponse.setId(programmingLanguage.getId());
			allProgrammingLanguagesResponse.setProgrammingLanguageName(programmingLanguage.getLanguageName());

			for (SubTechnology sT : programmingLanguage.getSubTechnology()) {
				subTechnologyNames.add(sT.getSubTechnologyName());
			}
			
			allProgrammingLanguagesResponse.setSubTechnologyNames(subTechnologyNames);
			
			// Yukarıdaki satırlarım ise sadece SubTechnology name lerini çekmek için...
			// Alltaki satırım da SubTechnology entitiy içeriğini detaylarıyla vermek için...
			// allProgrammingLanguagesResponse.setSubTechnologies(programmingLanguage.getSubTechnology());
			languagesResponses.add(allProgrammingLanguagesResponse);
		}
		return languagesResponses;
	}

	@Override
	public ProgrammingLanguagesResponse getByIdProgrammingLanguageResponse(int id) {
		ProgrammingLanguagesResponse programmingLanguageResponse = new ProgrammingLanguagesResponse();
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id).get();
		programmingLanguageResponse.setId(programmingLanguage.getId());
		programmingLanguageResponse.setProgrammingLanguageName(programmingLanguage.getLanguageName());
		return programmingLanguageResponse;
	}

}
