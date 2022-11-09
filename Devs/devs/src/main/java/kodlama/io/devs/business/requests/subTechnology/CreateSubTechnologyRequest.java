package kodlama.io.devs.business.requests.subTechnology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreateSubTechnologyRequest {
	private String subTechnologyName;
	private int programmingLanguageId;
}
