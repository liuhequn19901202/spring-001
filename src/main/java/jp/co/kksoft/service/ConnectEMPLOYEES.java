package jp.co.kksoft.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jp.co.kksoft.connectoracle.SqlMapper002;
import jp.co.kksoft.dbdto.EmployeesDto;
import jp.co.kksoft.form.EmployeesResultBean;

@Component
public class ConnectEMPLOYEES {

	@Autowired
	private SqlMapper002 sqlempMap;

	/*public JobsResultBean getTableJobs02(Integer min_salary) {
		JobsResultBean bean = new JobsResultBean();
		JobsResultDto output = sqlMap.JOBS002(min_salary);
		if(output!=null){
		BeanUtils.copyProperties( bean ,output);
		}
		return bean;
	}
*/
	public List<EmployeesResultBean> getTableJobs02(String JOB_ID) {
		List<EmployeesResultBean> beanList = new ArrayList<EmployeesResultBean>();

		List<EmployeesDto> outputlist = sqlempMap.JOBS003(JOB_ID);
		//List<EmployeesDto> beanList = sqlempMap.JOBS003(JOB_ID);
		/*if(EMPLOYEE_ID == null){
			outputlist = sqlempMap.JOBS003(EMPLOYEE_ID);
		}
		if(outputlist.size()==0){
			model.addAttribute("message", "情報を存在していません");
		}*/
		beanList = outputlist.stream().map(this::EmpDtoToBean).collect(Collectors.toList());
		return beanList;
	}

	private EmployeesResultBean EmpDtoToBean (EmployeesDto empdto){
		EmployeesResultBean bean = new EmployeesResultBean();
		BeanUtils.copyProperties(empdto, bean);
		return bean;
	}
}
