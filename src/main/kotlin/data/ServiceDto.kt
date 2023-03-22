package data

import domain.Skills
import java.math.BigDecimal

data class ServiceDto (val id: Int, val employeeId: Int, val skills: Skills, val price: Int)