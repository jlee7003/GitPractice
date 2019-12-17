package kr.co.GitPractice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.GitPractice.command.ListCommand;
import kr.co.GitPractice.command.WriteCommand;
import kr.co.GitPractice.dto.Dto;
import kr.co.GitPractice.util.Util;


@Controller
public class mycontroller {

	private JdbcTemplate template;
	
	@Autowired
	public void setTemp(JdbcTemplate template)
	{
		this.template=template;
		Util.template=template;
	}
	
	@RequestMapping("/write")
	public String write(HttpSession session, Model model, HttpServletRequest request) 
	{
		return "/write";
	}
	
	
	@RequestMapping("/write_ok")
	public String write_ok(Dto dto,HttpSession session, Model model, HttpServletRequest request) 
	{
		WriteCommand wc= new WriteCommand();
		wc.execute(dto);
		
		return "redirect:/list";
	}
	
	@RequestMapping("/list")
	public String list(Dto dto,HttpSession session, Model model, HttpServletRequest request) 
	{
		ListCommand lc= new ListCommand();
		lc.execute(model);
		
		return "/list";
	}
	
}
