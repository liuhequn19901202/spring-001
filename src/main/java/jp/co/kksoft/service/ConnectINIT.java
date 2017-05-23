package jp.co.kksoft.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jp.co.kksoft.connectoracle.SqlMapper003;
import jp.co.kksoft.dbdto.InitResultDto;
import jp.co.kksoft.form.InitResultBean;

@Component
public class ConnectINIT {

	@Autowired
	private SqlMapper003 sqlinitMap;

	/*public JobsResultBean getTableJobs02(Integer min_salary) {
		JobsResultBean bean = new JobsResultBean();
		JobsResultDto output = sqlMap.JOBS002(min_salary);
		if(output!=null){
		BeanUtils.copyProperties( bean ,output);
		}
		return bean;
	}
*/
	public List<InitResultBean> getTableJobs03() {
		List<InitResultBean> beanList = new ArrayList<InitResultBean>();

		List<InitResultDto> outputlist = sqlinitMap.JOBS004();
		//List<EmployeesDto> beanList = sqlempMap.JOBS003(JOB_ID);
		/*if(EMPLOYEE_ID == null){
			outputlist = sqlempMap.JOBS003(EMPLOYEE_ID);
		}
		if(outputlist.size()==0){
			model.addAttribute("message", "情報を存在していません");
		}*/
		beanList = outputlist.stream().map(this::InitDtoToBean).collect(Collectors.toList());
		return beanList;
	}

	private InitResultBean InitDtoToBean (InitResultDto initdto){
		InitResultBean bean = new InitResultBean();
		BeanUtils.copyProperties(initdto, bean);
		return bean;
	}
}
