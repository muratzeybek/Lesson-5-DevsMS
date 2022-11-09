package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.business.requests.subTechnology.CreateSubTechnologyRequest;
import kodlama.io.devs.business.responses.subTechnology.SubTechnologiesResponse;

public interface SubTechnologyService {
	void createSubTechnology(CreateSubTechnologyRequest createSubTechnologyRequest);
	void updateSubTechnology();
	void deleteSubTechnology(int id);
	SubTechnologiesResponse getByIdSubTechnologyResponse(int id);
	List<SubTechnologiesResponse> getAllSubTechnologiesResponse();
	
}
