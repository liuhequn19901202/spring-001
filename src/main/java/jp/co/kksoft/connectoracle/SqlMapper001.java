package jp.co.kksoft.connectoracle;

import java.util.List;

import jp.co.kksoft.dbdto.JobsResultDto;

public interface SqlMapper001 {

	List<JobsResultDto> JOBS001();

	List<JobsResultDto> JOBS002(int id);

}
