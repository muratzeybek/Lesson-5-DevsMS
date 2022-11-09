package kodlama.io.devs.business.responses.programmingLanguage;

import java.util.List;

import kodlama.io.devs.entities.concretes.SubTechnology;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProgrammingLanguagesResponse {
	private int id;
	private String programmingLanguageName;
	private List<SubTechnology> subTechnologies;
	private List<String> subTechnologyNames;
}
