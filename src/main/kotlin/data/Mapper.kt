package data

import domain.Client
import domain.Employee
import domain.Order
import domain.Service

class Mapper(private val dataSource: BeautySalonDataSource) {
    fun toOrderDto(order: Order) = OrderDto(
            id = order.id,
            clientId = order.client.id,
            services = order.services.map { toServiceDto(it) }
    )

    fun toOrder(order: OrderDto): Order {
        val current = dataSource.getClients().first { it.id == order.clientId }
        return Order(
            id = order.id,
            client = toClient(current),
            services = order.services.map { toService(it) }
        )
    }

    fun toClientDto(client: Client): ClientDto {

    }

    fun toClient(client: ClientDto): Client {

    }

    fun toEmployeeDto(employee: Employee): EmployeeDto {

    }

    fun toEmployee(employee: EmployeeDto): Employee {

    }

    private fun toServiceDto(service: Service) = ServiceDto(
        id = service.id,
        employeeId = service.employee.id,
        skills = service.skills,
        price = service.price
    )

    private fun toService(service: ServiceDto): Service {
        val current = dataSource.getEmployees().first { it.id == service.employeeId }
        return Service(
            id = service.id,
            skills = service.skills,
            price = service.price,
            employee = toEmployee(current)
        )
    }
}