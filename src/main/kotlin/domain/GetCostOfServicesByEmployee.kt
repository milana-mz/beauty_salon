package domain

class GetCostOfServicesByEmployee(private val repository: BeautySalonRepository) {
//    fun get(employeeId: Int): Order {
//        val services = repository.getOrders().filter { it.services== getSumForServices()}
//    }
//
//    private fun getSumForServices(list: List<Service>, employeeId: Int): List<Service> {
//        return list.filter { it.employee.id }
//    }

    fun calculateServicesCostByEmployee(services: List<Service>): Map<Employee, Int> {
        // Создаем пустой Map для хранения стоимостей услуг каждого работника
        val servicesCostByEmployee = mutableMapOf<Employee, Int>()

        // Проходимся по списку услуг и вычисляем стоимость для каждой из них
        for (service in services) {
            // Получаем работника, оказавшего услугу
            val employee = service.employee

            // Получаем стоимость услуги и добавляем ее к общей стоимости услуг этого работника
            val serviceCost = service.price
            servicesCostByEmployee[employee] = servicesCostByEmployee.getOrDefault(employee, 0) + serviceCost
        }

        return servicesCostByEmployee
    }

}