package org.fmiplovdiv.weblanguages.todo.dto;

public record TodoRequest(
		Long id,
		String task, 
		String description,
		Long teamMember) {

}