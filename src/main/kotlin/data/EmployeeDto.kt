package data

import domain.Skills

data class EmployeeDto(val id: Int, val name: String, val skills: List<Skills>)