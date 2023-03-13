package domain

interface BeautySalonRepository {
    fun getClients(): List<Client>
    fun getEmployees(): List<Employee>
    fun getOrders(): List<Order>
}