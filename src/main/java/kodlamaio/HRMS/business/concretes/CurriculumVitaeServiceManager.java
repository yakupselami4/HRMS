package kodlamaio.HRMS.business.concretes;

import java.util.List;

import kodlamaio.HRMS.DataAccess.abstracts.CurriculumVitaeServiceDao;
import kodlamaio.HRMS.Entities.concretes.CurriculumVitae;
import kodlamaio.HRMS.business.abstracts.CurriculumVitaeService;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessDataResult;

public class CurriculumVitaeServiceManager implements CurriculumVitaeService{

	private CurriculumVitaeServiceDao cvdao;
	

	@Override
	public DataResult<CurriculumVitae> getByHighSchoolAndUniversity(String highSchool, String university) {
		return new SuccessDataResult<CurriculumVitae>(this.cvdao.getByHighSchoolAndUniversity(highSchool, university));
	}

	@Override
	public DataResult<CurriculumVitae> getByLanguageAndAbilities(String language, String abilities) {
		return new SuccessDataResult<CurriculumVitae>(this.cvdao.getByLanguageAndAbilities(language, abilities));
	}

	@Override
	public DataResult<CurriculumVitae> getByGithubAddressAndLinkedInAddress(String githubAddress,
			String linkedInAddress) {
		return new SuccessDataResult<CurriculumVitae>(this.cvdao.getByGithubAddressAndLinkedInAddress(githubAddress, linkedInAddress));
	}

	@Override
	public DataResult<CurriculumVitae> getByWorkplaceName(String workplaceName) {
		return new SuccessDataResult<CurriculumVitae>(this.cvdao.getByWorkplaceName(workplaceName));
	}

}
