package data

import domain.Skills

class BeautySalonDataSourceImpl: BeautySalonDataSource {
    override fun getClients(): List<ClientDto> = listOf(
//        ClientDto(1, "Kira", 23),
//        ClientDto(2, "Eva", 32)
    )

    override fun getEmployees(): List<EmployeeDto> = listOf(
//        EmployeeDto(1, "Irina", "EYERBOWS"),
//        EmployeeDto(2, "Bella", "HAIRDRESSER")
    )

    override fun getOrders(): List<OrderDto> = listOf()

}