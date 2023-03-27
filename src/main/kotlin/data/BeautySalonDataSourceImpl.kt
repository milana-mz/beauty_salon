package data

import domain.Client
import domain.Skills
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.InputStream
import java.nio.file.Paths

/*
* на входе будет CsvParser со списком от списка полей
* */

class BeautySalonDataSourceImpl(): BeautySalonDataSource {

    override fun getClients(): List<ClientDto> = listOf(


//        ClientDto(1, "Kira", 23),
//        ClientDto(2, "Eva", 32)
    )

    override fun getEmployees(): List<EmployeeDto> = listOf(
        EmployeeDto(1, "Irina", listOf(Skills.EYERBOWS)),
        EmployeeDto(2, "Bella", listOf(Skills.HAIRDRESSER))
    )

    override fun getOrders(): List<OrderDto> = listOf(
        OrderDto(1, 1, listOf(ServiceDto(1, 1, Skills.EYERBOWS, 250), ServiceDto(2,2,Skills.HAIRDRESSER, 450)))
    )

}