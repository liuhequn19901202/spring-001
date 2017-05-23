package jp.co.kksoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.kksoft.form.JobsResultBean;
import jp.co.kksoft.modelview.TestModelView;
import jp.co.kksoft.service.ConnectDbService;

@Controller
public class OracleDbController {

	@Autowired
	private ConnectDbService service;


	@RequestMapping(value = "test001", method = RequestMethod.GET)
	public String test0001Method(Model model) {
		TestModelView testview = new TestModelView();
		model.addAttribute("message1", "(※0の場合は全て情報が検索できる)");
		model.addAttribute("testview", testview);
		return "selectJobs";
	}

	@RequestMapping(value = "test001", method = RequestMethod.POST)
	public String getFormInfo( Model model ,TestModelView testview ) {

		//service.getTableJobs02(testview.getNumber());
		List<JobsResultBean> lists=service.getTableJobs02(testview.getNumber(),model);
//		java.util.regex.Pattern pattern=java.util.regex.Pattern.compile("[0-9]*");
//	     CharSequence str = "";
//		java.util.regex.Matcher match=pattern.matcher(str);
//		if(match.matches()==false ){
//			model.addAttribute("message1", "数字を入力ください");
//	    }
		model.addAttribute("message1", "(※0の場合は全て情報が検索できる)");
		model.addAttribute("lists", lists);
		model.addAttribute("testview", testview);

	    return "selectJobs";
	}
//	@RequestMapping(value = "/test/", method = RequestMethod.GET)
//	public String testAll(Model model) {
//	    List<TestDto> tests = testService.getTestAll();
//	    model.addAttribute("message", "MyBatisの全件取得サンプルです");
//	    model.addAttribute("tests", tests);
//	    return "testAll";
//	}
}
