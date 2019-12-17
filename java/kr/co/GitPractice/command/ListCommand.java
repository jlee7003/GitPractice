package kr.co.GitPractice.command;

import org.springframework.ui.Model;

import kr.co.GitPractice.dao.Dao;

public class ListCommand {

	public void execute(Model model)
	{
		Dao dao = new Dao();
		dao.list(model);
	}
}
