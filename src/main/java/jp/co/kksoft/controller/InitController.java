package jp.co.kksoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.kksoft.service.ConnectINIT;

@Controller
public class InitController {

	@Autowired
	private ConnectINIT serviceinit;


	@RequestMapping(value = "test003", method = RequestMethod.GET)
	public String test0003Method(Model model) {
		//InitView initview = new InitView();
		//List<InitResultBean> init=serviceinit.getTableJobs03();
		//model.addAttribute("init", initview);
		//model.addAttribute("init", init);
		return "init";
	}


	@RequestMapping(value = "test004", method = RequestMethod.GET)
	public String test0004Method(Model model) {
		//InitView initview = new InitView();
		//List<InitResultBean> init=serviceinit.getTableJobs03();
		//model.addAttribute("init", initview);
		//model.addAttribute("init", init);
		return "init";
	}

//	@RequestMapping(value = "test003", method = RequestMethod.POST)
//	public String getFormInfo( Model model ,TestModelView testview ) {
//
//		//service.getTableJobs02(testview.getNumber());
//		List<JobsResultBean> lists=service.getTableJobs02(testview.getNumber(),model);
////		java.util.regex.Pattern pattern=java.util.regex.Pattern.compile("[0-9]*");
////	     CharSequence str = "";
////		java.util.regex.Matcher match=pattern.matcher(str);
////		if(match.matches()==false ){
////			model.addAttribute("message1", "数字を入力ください");
////	    }
//		model.addAttribute("message1", "(※0の場合は全て情報が検索できる)");
//		model.addAttribute("lists", lists);
//		model.addAttribute("testview", testview);
//
//	    return "selectJobs";
//	}
////	@RequestMapping(value = "/test/", method = RequestMethod.GET)
////	public String testAll(Model model) {
////	    List<TestDto> tests = testService.getTestAll();
////	    model.addAttribute("message", "MyBatisの全件取得サンプルです");
////	    model.addAttribute("tests", tests);
////	    return "testAll";
////	}
}
