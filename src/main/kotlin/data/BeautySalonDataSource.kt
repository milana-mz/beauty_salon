package data

interface BeautySalonDataSource {
    fun getClients(): List<ClientDto>
    fun getEmployees(): List<EmployeeDto>
    fun getOrders(): List<OrderDto>
}