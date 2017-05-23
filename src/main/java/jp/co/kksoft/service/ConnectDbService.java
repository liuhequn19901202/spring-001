package jp.co.kksoft.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import jp.co.kksoft.connectoracle.SqlMapper001;
import jp.co.kksoft.dbdto.JobsResultDto;
import jp.co.kksoft.form.JobsResultBean;

@Component
public class ConnectDbService {

	@Autowired
	private SqlMapper001 sqlMap;

	/*public JobsResultBean getTableJobs02(Integer min_salary) {
		JobsResultBean bean = new JobsResultBean();
		JobsResultDto output = sqlMap.JOBS002(min_salary);
		if(output!=null){
		BeanUtils.copyProperties( bean ,output);
		}
		return bean;
	}
*/
	public List<JobsResultBean> getTableJobs02(int min_salaryzz,Model model) {
		List<JobsResultBean> beanList = new ArrayList<JobsResultBean>();

		List<JobsResultDto> outputlist = sqlMap.JOBS002(min_salaryzz);
		if(min_salaryzz == 0){
			outputlist = sqlMap.JOBS001();
		}
		if(outputlist.size()==0){
			model.addAttribute("message", "情報を存在していません");
		}
		beanList = outputlist.stream().map(this::DtoToBean).collect(Collectors.toList());
		return beanList;
	}

	private JobsResultBean DtoToBean (JobsResultDto dto){
		JobsResultBean bean = new JobsResultBean();
		BeanUtils.copyProperties(dto, bean);
		return bean;
	}
}
