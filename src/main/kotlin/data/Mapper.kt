package data

import domain.*

class Mapper(private val dataSource: BeautySalonDataSource) {
    fun toOrderDto(order: Order) = OrderDto(
            id = order.id,
            clientId = order.client.id,
            services = order.services.map { toServiceDto(it) }
    )

    fun toOrder(order: OrderDto): Order {
        val current2 = dataSource.getClients().first { it.id == order.clientId }
        return Order(
            id = order.id,
            client = toClient(current2),
            services = order.services.map { toService(it) }
        )
    }

    fun toClientDto(client: Client) = ClientDto(
        id = client.id,
        age = client.age,
        name = client.name,
    )

    fun toClient(client: ClientDto): Client {
        return Client(
            id = client.id,
            age = client.age,
            name = client.name
        )
    }

    fun toEmployeeDto(employee: Employee) = EmployeeDto(
        id = employee.id,
        skills = listOf<Skills>(),
        name = employee.name
    )

    fun toEmployee(employee: EmployeeDto): Employee {
        return Employee(
            id = employee.id,
            skills = employee.,
            name = employee.name
        )
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