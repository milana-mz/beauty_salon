package data

import domain.BeautySalonRepository
import domain.Client
import domain.Employee
import domain.Order

class BeautySalonRepositoryImpl(
    private val dataSource: BeautySalonDataSource,
    private val mapper: Mapper
): BeautySalonRepository {
    override fun getClients(): List<Client> {
       return dataSource.getClients().map { mapper.toClient(it) }
    }

    override fun getEmployees(): List<Employee> {
        return dataSource.getEmployees().map { mapper.toEmployee(it) }
    }

    override fun getOrders(): List<Order> {
        return dataSource.getOrders().map { mapper.toOrder(it) }
    }

}