package com.example.demo.user.domain.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="t_salary")
public class Salary {
	@EmbeddedId
	private String userId;
	private String yearMonth;
	private Integer salary;
}
