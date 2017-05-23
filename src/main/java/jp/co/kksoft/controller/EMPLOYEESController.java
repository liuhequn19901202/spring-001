package jp.co.kksoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.kksoft.form.EmployeesResultBean;
import jp.co.kksoft.modelview.EmployeesView;
import jp.co.kksoft.service.ConnectEMPLOYEES;

@Controller
public class EMPLOYEESController {

	@Autowired
	private ConnectEMPLOYEES serviceemp;


	@RequestMapping(value = "test002", method = RequestMethod.GET)
	public String test0002Method(Model model) {
		EmployeesView empview = new EmployeesView();
		//model.addAttribute("message1", "(※0の場合は全て情報が検索できる)");
		List<EmployeesResultBean> selectEmployees=serviceemp.getTableJobs02(empview.getStr());
		model.addAttribute("selects", selectEmployees);
		model.addAttribute("empview", empview);
		return "selectEmployees";
	}

//	@RequestMapping(value = "test002", method = RequestMethod.POST)
//	public String getFormInfo( Model model ,EmployeesView empview ) {
//
//		//service.getTableJobs02(testview.getNumber());
//		List<EmployeesDto> selectEmployees=serviceemp.getTableJobs02(empview.getStr());
////		java.util.regex.Pattern pattern=java.util.regex.Pattern.compile("[0-9]*");
////	     CharSequence str = "";
////		java.util.regex.Matcher match=pattern.matcher(str);
////		if(match.matches()==false ){
////			model.addAttribute("message1", "数字を入力ください");
////	    }
//		model.addAttribute("selectEmployees", selectEmployees);
//		model.addAttribute("empview", empview);
//
//	    return "selectEmployees";
//	}
//	@RequestMapping(value = "/test/", method = RequestMethod.GET)
//	public String testAll(Model model) {
//	    List<TestDto> tests = testService.getTestAll();
//	    model.addAttribute("message", "MyBatisの全件取得サンプルです");
//	    model.addAttribute("tests", tests);
//	    return "testAll";
//	}
}
