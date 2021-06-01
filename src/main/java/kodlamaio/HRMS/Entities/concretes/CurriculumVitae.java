package kodlamaio.HRMS.Entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="curriculumn_vitae")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurriculumVitae {
	@Id
	@Column(name="cv_id")
	private int cv_id;
	
	@Column(name="github_address")
	private String githubAddress;
	
	@Column(name="linkedin_address")
	private String linkedInAddress;
	
	@Column(name="workplace_name")
	private String workplaceName;
	
	@Column(name="high_school")
	private String highSchool;
	
	@Column(name="university")
	private String university;
	
	@Column(name="language")
	private String language;
	
	@Column(name="abilities")
	private String abilities;
	
	
	
	

}
