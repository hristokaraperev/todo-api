package org.fmiplovdiv.weblanguages.todo.dto;

import org.fmiplovdiv.weblanguages.todo.model.TodoStatus;

public record TodoResponse(
		Long id,
		String task, 
		String description,
		Integer todoStatus, 
		Long teamMember) {


}
