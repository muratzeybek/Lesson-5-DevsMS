package kodlama.io.devs.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "programming_languages")
// @Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProgrammingLanguage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "language_name", length = 30, nullable = false, unique = true)
	private String languageName;

	@JsonBackReference
	@OneToMany(mappedBy = "programmingLanguage", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<SubTechnology> subTechnology;
}
