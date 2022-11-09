package kodlama.io.devs.business.responses.subTechnology;

import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SubTechnologiesResponse {
	private int id;
	private String subTechnologyName;
	private ProgrammingLanguage programmingLanguage; 
}
