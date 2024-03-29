package edu.kh.todolist.todo.model.dto;

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
public class Todo {

	private int todoNo;
	private String todoTitle;
	private String todoMemo;
	private String todoDate;
	private String todoDeleteFlag;
	
}
