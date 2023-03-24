package domain

class GetCostOfServicesByEmployeeUseCase(private val repository: BeautySalonRepository) {
//    fun get(employeeId: Int): Order {
//        val services = repository.getOrders().filter { it.services== getSumForServices()}
//    }
//
//    private fun getSumForServices(list: List<Service>, employeeId: Int): List<Service> {
//        return list.filter { it.employee.id }
//    }

//    fun calculateServicesCostByEmployee(services: List<Service>): Map<Employee, Int> {
//        // Создаем пустой Map для хранения стоимостей услуг каждого работника
//        val servicesCostByEmployee = mutableMapOf<Employee, Int>()
//
//        // Проходимся по списку услуг и вычисляем стоимость для каждой из них
//        for (service in services) {
//            // Получаем работника, оказавшего услугу
//            val employee = service.employee
//
//            // Получаем стоимость услуги и добавляем ее к общей стоимости услуг этого работника
//            val serviceCost = service.price
//            servicesCostByEmployee[employee] = servicesCostByEmployee.getOrDefault(employee, 0) + serviceCost
//        }
//
//        return servicesCostByEmployee
//    }

    /*Стоимость услуг оказаных каждым работником
    1. Перебираем сотрудников
    2. найти сумму стоимости услуг
    3.
    * */

    fun calculateServicesCostByEmployee(service: List<Service>): List<EmployeePriceData> =
        repository.getEmployees().map { (id, name) ->
            val sum = service.filter { it.employee.id == id }.sumOf { it.price }
            EmployeePriceData(name, sum)
        }

//    fun calculateServicesCostByEmployee(service: List<Service>): List<EmployeePriceData> {
//        val result = arrayListOf<EmployeePriceData>()
//        for (employee in repository.getEmployees()) {
//            val sum = service.filter { it.employee.id == employee.id }.sumOf { it.price }
//            val employeePriceData = EmployeePriceData(employee.name, sum)
//            result.add(employeePriceData)
//        }
//        return result
//    }

}