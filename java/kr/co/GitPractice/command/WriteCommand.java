package kr.co.GitPractice.command;

import kr.co.GitPractice.dao.Dao;
import kr.co.GitPractice.dto.Dto;

public class WriteCommand
{

	public void execute(Dto dto) {
		Dao dao=new Dao();
    	dao.write(dto.getName(),dto.getAge(),dto.getPhone());
	}
}
