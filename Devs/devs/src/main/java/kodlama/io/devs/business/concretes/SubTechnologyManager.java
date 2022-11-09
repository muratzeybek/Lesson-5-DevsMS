package kodlama.io.devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.SubTechnologyService;
import kodlama.io.devs.business.requests.subTechnology.CreateSubTechnologyRequest;
import kodlama.io.devs.business.responses.subTechnology.SubTechnologiesResponse;
import kodlama.io.devs.dataAccess.abstracts.SubTechnologyRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import kodlama.io.devs.entities.concretes.SubTechnology;

@Service
public class SubTechnologyManager implements SubTechnologyService {

	SubTechnologyRepository subTechnologyRepository;
	
	@Autowired
	public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository) {
		this.subTechnologyRepository = subTechnologyRepository;
	}

	@Override
	public void createSubTechnology(CreateSubTechnologyRequest createSubTechnologyRequest) {
		SubTechnology subTechnology = new SubTechnology();
		subTechnology.setSubTechnologyName(createSubTechnologyRequest.getSubTechnologyName());
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.setId(createSubTechnologyRequest.getProgrammingLanguageId());
		
		subTechnology.setProgrammingLanguage(language);
		subTechnologyRepository.save(subTechnology);
	}

	@Override
	public void updateSubTechnology() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSubTechnology(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SubTechnologiesResponse getByIdSubTechnologyResponse(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SubTechnologiesResponse> getAllSubTechnologiesResponse() {
		List<SubTechnologiesResponse> subTechnologiesResponses = new ArrayList<>();
		for (SubTechnology subTechnology : subTechnologyRepository.findAll()) {
			SubTechnologiesResponse allSubTechnologiesResponse = new SubTechnologiesResponse();
			allSubTechnologiesResponse.setId(subTechnology.getId());
			allSubTechnologiesResponse.setSubTechnologyName(subTechnology.getSubTechnologyName());
			allSubTechnologiesResponse.setProgrammingLanguage(subTechnology.getProgrammingLanguage());
			subTechnologiesResponses.add(allSubTechnologiesResponse);
		}
		return subTechnologiesResponses;
	}

}
