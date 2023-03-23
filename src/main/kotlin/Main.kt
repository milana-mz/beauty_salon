import data.BeautySalonDataSource
import data.BeautySalonDataSourceImpl
import domain.BeautySalonRepository
import domain.Client
import domain.GetAllPriceUseCase
import domain.Service
import ui.BeautySalonAdater
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.InputStream
import com.opencsv.CSVReader
import com.opencsv.CSVReaderBuilder
import data.ClientDto

//fun readClientsFromCsv(filePath: String): List<ClientDto> {
//    val reader = CSVReaderBuilder(FileReader(filePath)).build()
//    val clients = mutableListOf<ClientDto>()
//    var record: Array<String>
//    while (reader.readNext().also { record = it } != null) {
//        clients.add(ClientDto.fromCsvRecord(record))
//    }
//    return clients
//}

fun main() {
    val adapter = DI.createBeautySalonAdapter()
    val dataSource = BeautySalonDataSourceImpl()
    val service =
    println(adapter.getAllPrice())
    println(adapter.getServiceCost(service))

//    val reader = FileReader("client.csv") // путь к файлу CSV
//    val csvReader = CSVReaderBuilder(reader).withSkipLines(1).build() // создаем объект CSVReader с пропуском заголовков
//
//    var record: Array<String>?
//    while (csvReader.readNext().also { record = it } != null) { // читаем каждую строку CSV
//        val column1 = record!![0] // первая колонка
//        val column2 = record!![1] // вторая колонка
//
//        // использование данных
//        println("$column1, $column2")
//    }
//
//    csvReader.close()

}