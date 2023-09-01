package com.billing.mgmt.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.billing.mgmt.model.Employee;
import com.billing.mgmt.model.Users;
import com.billing.mgmt.service.IEmployeeService;
import com.billing.mgmt.service.UserService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private IEmployeeService service;

	@Autowired
	private UserService userService;

	// 1. show Register page
	/**
	 * If End user enters /register, GET type then we should display one Register
	 * page in browser
	 */

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logoutPage(Model model) {
		String mesage = "You logout successfull";
		model.addAttribute("message", mesage);
		return "login";
	}

	@PostMapping("/logincheck")
	public String logincheckEmp(@ModelAttribute Users users, Model model) {

		Users oauthUser = userService.logincheckEmp(users);
		System.out.print(oauthUser);

		if (Objects.nonNull(oauthUser) && oauthUser.getPassword().equals(users.getPassword())) {
			String mesage = "You login successfull";
			model.addAttribute("message", mesage);
			return "EmployeeRegister";
		} else {

			String mesage = "You have enter wrong credential";
			model.addAttribute("message", mesage);
			return "login";
		}
	}

	@GetMapping("/register")
	public String showReg() {
		return "EmployeeRegister";
	}

	/***
	 * On Click HTML FORM SUBMIT READ DATA AS MODLEATTRIBUTE SAVE USING SERVICE
	 * RETURN MESSAGE TO UI
	 */
	// 2. save() : Click Form submit
	@PostMapping("/save")
	public String saveEmp(@ModelAttribute Employee employee, Model model) {
		Integer id = service.saveEmployee(employee);
		String mesage = "Employee '" + id + "' created!!";
		model.addAttribute("message", mesage);
		return "EmployeeRegister";
	}

	/***
	 * FETCH DATA FROM DATABASE as LIST<T> SEND THIS TO UI. USE FOR EACH AND DISPLAY
	 * AS HTML TABLE
	 */
	// 3. display all rows
	@GetMapping("/all")
	public String getAllEmps(Model model) {
		commonDataFetch(model);
		return "EmployeeData";
	}

	private void commonDataFetch(Model model) {
		List<Employee> emps = service.getAllEmployees();
		model.addAttribute("list", emps);
	}

	// 4. Delete by id
	@GetMapping("/delete")
	public String deleteById(@RequestParam Integer id, Model model) {
		// delete record by id
		service.deleteEmployee(id);
		// send message to ui
		model.addAttribute("message", "Employee '" + id + "' Deleted!!");

		// also load latest data
		commonDataFetch(model);
		return "EmployeeData";
	}

	// 5. Show Data in Edit (by id)
	/***
	 * On click Edit Link , read id and load object from DB if exist goto Edit page,
	 * else redirect to all page
	 */
	@GetMapping("/edit")
	public String showEdit(@RequestParam Integer id, Model model) {
		String page = null;
		// try to load data from DB
		Optional<Employee> opt = service.getOneEmployee(id);
		// if data exist
		if (opt.isPresent()) {
			model.addAttribute("employee", opt.get());
			page = "EmployeeEdit";
		} else { // no data exist
			page = "redirect:all"; // goto data page
		}
		return page;
	}

	// 6. Update data
	/**
	 * On Click Update button, read Form data as ModelAttribute Update in DB and
	 * send success message to UI. Also load latest data
	 */
	@PostMapping("/update")
	public String doUpdate(@ModelAttribute Employee employee, Model model) {
		service.updateEmployee(employee);
		// send message to ui
		model.addAttribute("message", "Employee '" + employee.getEmpId() + "' Updated!!");

		// also load latest data
		commonDataFetch(model);
		return "EmployeeData";

	}
}
