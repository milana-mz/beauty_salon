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

fun main() {
    val adapter = DI.createBeautySalonAdapter()
    val dataSource = BeautySalonDataSourceImpl()
    val service =
    println(adapter.getAllPrice())
    println(adapter.getServiceCost(service))

//    val reader = FileReader("client.csv")
//    val csvReader = CSVReaderBuilder(reader).withSkipLines(1).build()
//
//    var record: Array<String>?
//    while (csvReader.readNext().also { record = it } != null) {
//        val column1 = record!![0]
//        val column2 = record!![1]
//
//        println("$column1, $column2")
//    }
//
//    csvReader.close()

}