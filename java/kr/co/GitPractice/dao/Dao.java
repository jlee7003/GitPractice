package kr.co.GitPractice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.ui.Model;

import kr.co.GitPractice.dto.Dto;
import kr.co.GitPractice.util.Util;


public class Dao 
{
	JdbcTemplate template;
	
	public Dao()
	{
		this.template=Util.template;
	}
	
	public void write(final String name,final String age,final String phone)
	{
		this.template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				String sql="insert into board3(name,age,phone,writeday) values(?,?,?,now())";
				PreparedStatement pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, name);
				pstmt.setString(2, age);
				pstmt.setString(3, phone);
				return pstmt;
			}
		});
	}

	
	
	public void list(Model model)
	{
		String sql="select * from board3 order by id desc";
		   ArrayList<Dto> list=(ArrayList<Dto>) template.query(sql, new BeanPropertyRowMapper<Dto>(Dto.class));	
		   model.addAttribute("list",list);
	
	}
}













