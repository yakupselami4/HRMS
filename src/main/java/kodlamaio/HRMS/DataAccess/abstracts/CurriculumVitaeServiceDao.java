package kodlamaio.HRMS.DataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.Entities.concretes.CurriculumVitae;
import kodlamaio.HRMS.core.utilities.results.DataResult;


public interface CurriculumVitaeServiceDao extends JpaRepository<CurriculumVitae,Integer>{
	
	//DataResult<List<CurriculumVitae>> getAll();
	
	CurriculumVitae getByHighSchoolAndUniversity(String highSchool, String university);
	
	CurriculumVitae getByLanguageAndAbilities(String language, String abilities);
	
	CurriculumVitae getByGithubAddressAndLinkedInAddress(String githubAddress,String linkedInAddress);
	
	CurriculumVitae getByWorkplaceName(String workplaceName);
	

}
