package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.Entities.concretes.CurriculumVitae;
import kodlamaio.HRMS.core.utilities.results.DataResult;

public interface CurriculumVitaeService {
	
	//DataResult<List<CurriculumVitae>> getAll();
	
	DataResult<CurriculumVitae> getByHighSchoolAndUniversity(String highSchool, String university);
	
	DataResult<CurriculumVitae> getByLanguageAndAbilities(String language, String abilities);
	
	DataResult<CurriculumVitae> getByGithubAddressAndLinkedInAddress(String githubAddress,String linkedInAddress);
	
	DataResult<CurriculumVitae> getByWorkplaceName(String workplaceName);

}
