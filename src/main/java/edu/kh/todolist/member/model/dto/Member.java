package edu.kh.todolist.member.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Member {

	// lombok 라이브러리 : getter / setter, 생성자, toString() 자동완성 라이브러리
	
	private int memberNo;
	private String memberId;
	private String memberPw;
	private String memberNickname;
	private String enrollDate;
	private String memberDeleteFlag;
	
}