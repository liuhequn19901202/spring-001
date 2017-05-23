package jp.co.kksoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.kksoft.form.Top01Form;

@Controller
public class TestController {




	@RequestMapping(value = "show", method = RequestMethod.GET)
	public String topVeiw(Model model) {

		Top01Form top01Form = new Top01Form();

		top01Form.setId(0);
		top01Form.setName("名前ここに書いてね");

		model.addAttribute("message", "こんにちわkkkです");
		model.addAttribute("top01Formxxx", top01Form);

		return "showMessage";
	}


	@RequestMapping(value = "/show", method = RequestMethod.POST)
	public String getFormInfo(@ModelAttribute Top01Form top01Form, Model model) {
	    model.addAttribute("message", "ID : " + top01Form.getId() + " & name : " + top01Form.getName());

	    model.addAttribute("top01Formxxx", top01Form);

	    return "showMessage";
	}


//
//
//	////////////////////////////////////////////////////////////
//	@RequestMapping(value ="checkbox" ,method = RequestMethod.GET)
//	public String getCheckBoxGet(Model model, CheckForm checkform) {
//		model.addAttribute("message", "checkのサンプル");
//		CheckForm form = new CheckForm();
//		form.setEmployees(new String[] { "次郎" });
//		model.addAttribute("checkForm", form);
//		model.addAttribute("checkEmployees", getCheckEmployees());
//
//		return "/testview/checkSample";
//	}
//
//	@RequestMapping(value ="checkbox" ,method = RequestMethod.POST)
//	public String getCheckBoxPost(Model model,  CheckForm checkform) {
//
//		String[] checkedEmployee = checkform.getEmployees();
//		StringBuilder builder = new StringBuilder();
//		for (String employee : checkedEmployee) {
//			builder.append(employee).append(System.lineSeparator());
//		}
//		model.addAttribute("message", builder);
//		model.addAttribute("checkForm", checkform);
//		model.addAttribute("checkEmployees", getCheckEmployees());
//
//		return "/testview/checkSample";
//	}
//	private List<String> getCheckEmployees() {
//        List<String> list = new LinkedList<>();
//        list.add("一太郎");
//        list.add("次郎");
//        list.add("三郎");
//        return list;
//    }
//
//
//	///////////////////////////////////////////////////////////////////////////
//	@RequestMapping(value ="radiobox" ,method = RequestMethod.GET)
//	public String getRadioboxGet(Model model, RadioForm radioForm) {
//		 model.addAttribute("message", "radioのサンプル");
//	        RadioForm form = new RadioForm();
//	        form.setName("次郎");
//	        model.addAttribute("radioForm", form);
//	        model.addAttribute("checkEmployees", getRadioEmployees());
//
//		return "/testview/radioSample";
//	}
//
//	@RequestMapping(value ="radiobox" ,method = RequestMethod.POST)
//	public String getRadioboxPost(Model model, @ModelAttribute RadioForm radioForm) {
//		 String selectedName = radioForm.getName();
//	        model.addAttribute("message", selectedName);
//	        model.addAttribute("radioForm", radioForm);
//	        model.addAttribute("checkEmployees", getRadioEmployees());
//		return "/testview/radioSample";
//	}
//
//    private List<String> getRadioEmployees() {
//        List<String> list = new LinkedList<>();
//        list.add("一太郎");
//        list.add("次郎");
//        list.add("三郎");
//        return list;
//    }
//
//    @RequestMapping(value = "selectbox", method = RequestMethod.GET)
//    public String getSelectboxGet(Model model) {
//        model.addAttribute("message", "selectのサンプル");
//        SelectForm form = new SelectForm();
//        form.setEmployees(new String[] { "次郎" });
//        model.addAttribute("selectForm", form);
//        model.addAttribute("selectEmployees", getSelectEmployees());
//        return "/testview/selectSample";
//    }
//
//    @RequestMapping(value = "selectbox", method = RequestMethod.POST)
//    public String getSelectboxPost(@ModelAttribute SelectForm form, Model model) {
//        String[] selectedEmployee = form.getEmployees();
//        StringBuilder builder = new StringBuilder();
//        for (String employee : selectedEmployee) {
//            builder.append(employee).append(System.lineSeparator());
//        }
//        model.addAttribute("message", builder);
//        model.addAttribute("selectForm", form);
//        model.addAttribute("selectEmployees", getSelectEmployees());
//        return "/testview/selectSample";
//    }
//
//    private List<String> getSelectEmployees() {
//        List<String> list = new LinkedList<>();
//        list.add("一太郎");
//        list.add("次郎");
//        list.add("三郎");
//        return list;
//    }
//
//
//    private EmployeeListDto employeeList = new EmployeeListDto();
//
//    @RequestMapping(value = "list", method = RequestMethod.GET)
//    public String list(Model model) {
//        model.addAttribute("title", "社員一覧");
//        model.addAttribute("message", "登録社員一覧情報を表示します");
//        EmployeeListForm form = new EmployeeListForm();
//        model.addAttribute("employeeListForm", form);
//        model.addAttribute("employeeList", employeeList);
//        return "/testview/list";
//    }
//
//    @RequestMapping(value = "list", method = RequestMethod.POST)
//    public String list(@ModelAttribute EmployeeListForm form, Model model, BindingResult result) {
//        EmployeeDto dto = new EmployeeDto();
//        BeanUtils.copyProperties(form, dto);
//        employeeList.add(dto);
//        model.addAttribute("title", "社員一覧");
//        model.addAttribute("message", form.getName() + "を登録しました。");
//        model.addAttribute("employeeListForm", new EmployeeListForm());
//        model.addAttribute("employeeList", employeeList);
//        return "/testview/list";
//    }
}
